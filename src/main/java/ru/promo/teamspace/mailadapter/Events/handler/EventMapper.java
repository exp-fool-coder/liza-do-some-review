package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Entity.EventEntity;
import ru.promo.teamspace.mailadapter.Events.ChannelEvent;
import ru.promo.teamspace.mailadapter.Events.IEvent;

public interface EventMapper<T extends IEvent> {

    EventEntity mapToEntity(T event);

    ChannelEvent getChannel();

    JSONObject getContext(T event);
}
