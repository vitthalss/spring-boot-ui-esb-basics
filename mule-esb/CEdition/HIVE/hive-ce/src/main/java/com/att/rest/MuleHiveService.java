package com.att.rest;

import java.util.Map;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;

@Path("/att")
public class MuleHiveService {
	private final static Logger logger = Logger.getLogger(MuleHiveService.class.getName());
	@GET
	@Path("/hive/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getName(@PathParam("name") String myName,MuleEventContext eventContext) {
		String output = "Hello Server say : Hello there, " + myName;
		MuleMessage muleMessage = eventContext.getMessage();
	     Map<String, String> queryParams = muleMessage.getInboundProperty("http.query.params");
	         String name=queryParams.get("name");
	         System.out.println("00000000000000000000000000000000000:::"+name);
	         /**
	          * return muleMessage;
	          */
		logger.info("00000000000000000000000000000000000::: "+output);
		return Response.status(200).entity(output).build();
	}

}
