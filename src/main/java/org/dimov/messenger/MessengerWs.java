package org.dimov.messenger;

import database.InMemoryDatabase;
import org.dimov.domain.Message;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("messenger")
public class MessengerWs {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Collection<Message> listInMemoryMessages() {
        return InMemoryDatabase.listMessages();
    }
}
