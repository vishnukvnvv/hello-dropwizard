package com.hello.api.resources;

import com.hello.api.core.ApiResponse;
import com.hello.api.core.Data;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
  public HelloWorldResource() {}

  @POST
  @Path("/one")
  public Response helloOne() {
    Data data = new Data("Hello one");
    ApiResponse response = new ApiResponse(data, new Object(), 200);
    return Response.status(response.getStatus()).entity(response).build();
  }

  @POST
  @Path("/two")
  public Response helloTwo() {
    Data data = new Data("Hello Two");
    ApiResponse response = new ApiResponse(data, new Object(), 200);
    return Response.status(response.getStatus()).entity(response).build();
  }

  @POST
  @Path("/three")
  public Response helloThree() {
    Data data = new Data("Hello three");
    ApiResponse response = new ApiResponse(data, new Object(), 200);
    return Response.status(response.getStatus()).entity(response).build();
  }
}
