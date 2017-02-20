package org.olivier.rest_with_jaxrs.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("date/{date_string}")
public class DateResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("date_string") MyDate date){
		return "date: " + date.toString();
	}
}
