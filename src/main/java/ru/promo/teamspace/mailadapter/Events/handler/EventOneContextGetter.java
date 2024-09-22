package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.AbstractProcessor;
import ru.promo.teamspace.mailadapter.Events.ChannelEvent;
import ru.promo.teamspace.mailadapter.Events.EventOne;

import static ru.promo.teamspace.mailadapter.Events.ChannelEvent.CHANNEL_ONE;

public class EventOneContextGetter extends AbstractProcessor<EventOne> {

    @Override
    public ChannelEvent getChannel() {
        return CHANNEL_ONE;
    }

    @Override
    public JSONObject getContext(EventOne event) {
        var context = new JSONObject();
        context.put("isBonus", event.getIsBonus());
        context.put("amount", event.getAmount());
        return context;
    }
}
