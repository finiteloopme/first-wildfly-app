/**
 * 
 */
package me.finiteloop.microservice.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 * @author klimaye
 *
 */
@Path("/echo")
public class EchoBean {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response echo(){
		StringBuffer message = new StringBuffer("Hello");
		ResponseBuilder response = null;
		response = Response.ok();
		response.entity(message.toString());
		return response.build();
	}
}
