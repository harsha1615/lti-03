package com.lti.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {
	
	@GET
	@Path("/{param1}")
	public Response getMsg(@PathParam("param1") String msg) {
		String output = "Welcome "+msg;
		return Response.status(200).entity(output).build();
	}
}
