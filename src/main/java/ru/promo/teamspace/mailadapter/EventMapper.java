package ru.promo.teamspace.mailadapter;

import ru.promo.teamspace.mailadapter.Entity.EventEntity;
import ru.promo.teamspace.mailadapter.Events.IEvent;
import ru.promo.teamspace.mailadapter.Events.handler.EventDoSomeContextGetting;

public class EventMapper<T extends IEvent> {

    private EventDoSomeContextGetting<T> eventDoSomeContextGetting;

    public EventMapper(EventDoSomeContextGetting<T> eventDoSomeContextGetting) {
        this.eventDoSomeContextGetting = eventDoSomeContextGetting;
    }

    public EventEntity mapToEntity(T event) {
        EventEntity eventEntity = new EventEntity();
        eventEntity.setTitle(event.getTitle());
        eventEntity.setDescription(event.getDescription());
        eventEntity.setDateTime(event.getDateTime());
        eventEntity.setProfile(event.getProfile());
        eventEntity.setContext(eventDoSomeContextGetting.getContext(event));
        return eventEntity;
    }

}
