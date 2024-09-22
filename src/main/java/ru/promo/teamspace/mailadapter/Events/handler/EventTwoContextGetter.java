package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.AbstractProcessor;
import ru.promo.teamspace.mailadapter.Events.ChannelEvent;
import ru.promo.teamspace.mailadapter.Events.EventTwo;

import static ru.promo.teamspace.mailadapter.Events.ChannelEvent.CHANNEL_TWO;

public class EventTwoContextGetter extends AbstractProcessor<EventTwo> {

    @Override
    public ChannelEvent getChannel() {
        return CHANNEL_TWO;
    }

    @Override
    public JSONObject getContext(EventTwo event) {
        var context = new JSONObject();
        context.put("status", event.getStatus());
        context.put("comment", event.getComment());
        return context;
    }
}
