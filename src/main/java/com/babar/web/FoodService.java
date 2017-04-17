package com.babar.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("web/food")
@Produces("application/json")
public class FoodService
{

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    public String getFoodList()
    {
        return "Get food list";
    }

    @GET
    @Path("/{foodId}")
    public String getSpecificFood(@PathParam("foodId") String foodId)
    {
        return "GET food nr: " + foodId;
    }
}
