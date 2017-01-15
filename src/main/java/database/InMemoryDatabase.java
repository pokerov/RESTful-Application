package database;

import org.dimov.domain.Message;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InMemoryDatabase {

    private static Map<String, Message> messagesDb = new HashMap<>();

    public static Collection<Message> listMessages () {
        messagesDb.put("1", new Message(1, "Kristiyan Dimov", "Microsoft", "http://www.microsoft.com/", new Date()));
        messagesDb.put("2", new Message(2, "Kristiyan Dimov", "Google", "http://www.google.com/", new Date()));
        return messagesDb.values();
    }
}
