package com.babar;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.babar.web.FoodService;

public class FoodServiceTest extends JerseyTest 
{

    @Override
    protected Application configure() 
    {
        return new ResourceConfig(FoodService.class);
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    @Test
    public void testGetIt() 
    {
        final String responseMsg = target().path("web/food").request().get(String.class);

        assertEquals("Get food list", responseMsg);
    }
}
