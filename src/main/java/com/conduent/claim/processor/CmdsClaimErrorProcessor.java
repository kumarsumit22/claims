package com.conduent.claim.processor;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.processor.validation.SchemaValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.conduent.claim.models.Error;
/**
 * 
 * @author C5107956
 *
 */
public class CmdsClaimErrorProcessor implements Processor {
	
		Logger LOGGER = LoggerFactory.getLogger(CmdsClaimErrorProcessor.class);
		  public void process(Exchange exchange) throws Exception {
			  //CamelExceptionCaught
			  Object object=exchange.getProperties().get("CamelExceptionCaught");
			  if(object instanceof SchemaValidationException ) {
				  SchemaValidationException exception=(SchemaValidationException) object;
				  LOGGER.error("Exception details {}",exception.getLocalizedMessage());
				  Error  error= new Error();
				  error.setErrorCode("400");
				  error.setErrorDesc("ValidationException");
				  error.setErrorDetails(exception.getLocalizedMessage());
			  ResponseBuilder jaxrsResponseBuilder = Response.status(400).entity(error);
				 Response response=jaxrsResponseBuilder.build();
				 exchange.getIn().setBody(response); 
			  }
		    
		  }

}
