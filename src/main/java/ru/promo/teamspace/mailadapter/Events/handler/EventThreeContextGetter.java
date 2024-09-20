package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Events.EventThree;

public class EventThreeContextGetter implements EventDoSomeContextGetting<EventThree> {

    @Override
    public JSONObject getContext(EventThree event) {
        var context = new JSONObject();
        context.put("sum", event.getSum());
        context.put("type", event.getType());
        return context;
    }
}
