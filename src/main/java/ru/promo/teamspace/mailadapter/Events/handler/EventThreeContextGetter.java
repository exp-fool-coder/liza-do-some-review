package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.AbstractProcessor;
import ru.promo.teamspace.mailadapter.Events.ChannelEvent;
import ru.promo.teamspace.mailadapter.Events.EventThree;

import static ru.promo.teamspace.mailadapter.Events.ChannelEvent.CHANNEL_THREE;

public class EventThreeContextGetter extends AbstractProcessor<EventThree> {

    @Override
    public ChannelEvent getChannel() {
        return CHANNEL_THREE;
    }

    @Override
    public JSONObject getContext(EventThree event) {
        var context = new JSONObject();
        context.put("sum", event.getSum());
        context.put("type", event.getType());
        return context;
    }
}
