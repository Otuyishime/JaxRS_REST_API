package org.olivier.rest_with_jaxrs.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("test")
public class Myresource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "Hey there!";
	}
}
