package org.olivier.rest_with_jaxrs.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
public class Myresource {
	private int count = 0;
	@PathParam("pathParam") private String pathParam;
	@QueryParam("query") private String queryParam;
	 
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod(){
		return "Hey there! count is: " + (count++) + " the path param used: "+ pathParam + "query used: " + queryParam + "!";
	}
}
