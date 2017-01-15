package org.dimov.messenger;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("messenger")
public class MessengerWs {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessengerInstance() {
        return "MessengerWs REST GET";
    }
}
