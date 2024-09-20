package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Events.EventOne;

public class EventOneContextGetter implements EventDoSomeContextGetting<EventOne> {

    @Override
    public JSONObject getContext(EventOne event) {
        var context = new JSONObject();
        context.put("isBonus", event.getIsBonus());
        context.put("amount", event.getAmount());
        return context;
    }
}
