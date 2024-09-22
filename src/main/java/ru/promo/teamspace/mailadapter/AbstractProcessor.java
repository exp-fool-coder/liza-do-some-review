package ru.promo.teamspace.mailadapter;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Entity.EventEntity;
import ru.promo.teamspace.mailadapter.Events.IEvent;
import ru.promo.teamspace.mailadapter.Events.handler.EventMapper;

public abstract class AbstractProcessor<T extends IEvent> implements EventMapper<T> {

    @Override
    public EventEntity mapToEntity(T event) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setTitle(event.getTitle());
        eventEntity.setDescription(event.getDescription());
        eventEntity.setDateTime(event.getDateTime());
        eventEntity.setProfile(event.getProfile());
        eventEntity.setContext(getContext(event));
        return eventEntity;
    }

    public abstract JSONObject getContext(T event);
}
