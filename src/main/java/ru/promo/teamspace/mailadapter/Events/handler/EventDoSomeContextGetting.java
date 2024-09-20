package ru.promo.teamspace.mailadapter.Events.handler;

import org.json.JSONObject;
import ru.promo.teamspace.mailadapter.Events.IEvent;

public interface EventDoSomeContextGetting<T extends IEvent> {
    JSONObject getContext(T event);
}
