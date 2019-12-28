package com.conduent.claim.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.conduent.claim.models.Claim;

/**
 * 
 * @author C5107956
 *
 */
public class CmdsClaimProcessor implements Processor {
	
		Logger LOGGER = LoggerFactory.getLogger(CmdsClaimProcessor.class);
		  public void process(Exchange exchange) throws Exception {
			  LOGGER.info("Fuse service Callled with request {}",exchange.getIn().getBody(Claim.class));
				 exchange.getIn().setBody(exchange.getIn().getBody(Claim.class)); 
		    
		  }

}
