package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Events.EventTwo;

public class EventTwoContextGetter implements EventDoSomeContextGetting<EventTwo> {

    @Override
    public JSONObject getContext(EventTwo event) {
        var context = new JSONObject();
        context.put("status", event.getStatus());
        context.put("comment", event.getComment());
        return context;
    }
}
