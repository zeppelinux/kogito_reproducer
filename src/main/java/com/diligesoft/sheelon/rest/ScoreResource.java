package com.diligesoft.sheelon.rest;

import com.diligesoft.sheelon.beans.ScoreBean;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/score")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ScoreResource {

    @Inject
    ScoreBean scoreBean;

    @GET
    public Response calculate() {
        scoreBean.getFactorValues();
        return Response.ok("it works").build();
    }
}