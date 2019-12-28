
  package com.conduent.claim.services;
  
  import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestBody;

import com.conduent.claim.models.Claim;
  /**
   * 
   * @author C5107956
   *
   */
  @Path(value = "/claimServices")
  public interface ClaimEndpoint {
  
  @POST
  @Path(value ="/create")
  @Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_PLAIN})
  @Produces( MediaType.APPLICATION_XML )
  public Claim createClaim(@RequestBody Claim claim);
  
  
  }
 