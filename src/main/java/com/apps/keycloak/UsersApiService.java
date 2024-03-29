package com.apps.keycloak;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)
public interface UsersApiService {

  @GET
  @Path("/{username}")
  User getUserDetails(@PathParam("username") String username);

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{username}/verify-password")
  VerifyPasswordResponse verifyUserPassword(@PathParam("username") String username,
                                            String password);

}