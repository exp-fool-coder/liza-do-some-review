package ru.promo.teamspace.mailadapter.config;

import ru.promo.teamspace.mailadapter.Events.ChannelEvent;
import ru.promo.teamspace.mailadapter.Events.EventOne;
import ru.promo.teamspace.mailadapter.Events.EventThree;
import ru.promo.teamspace.mailadapter.Events.EventTwo;
import ru.promo.teamspace.mailadapter.Events.handler.EventMapper;
import ru.promo.teamspace.mailadapter.Events.handler.EventOneContextGetter;
import ru.promo.teamspace.mailadapter.Events.handler.EventThreeContextGetter;
import ru.promo.teamspace.mailadapter.Events.handler.EventTwoContextGetter;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EventConfig {

    private final EventMapper<EventOne> eventOneMapper = new EventOneContextGetter();
    private final EventMapper<EventTwo> eventTwoMapper = new EventTwoContextGetter();
    private final EventMapper<EventThree> eventThreeMapper = new EventThreeContextGetter();

    private final List<EventMapper> eventProcessors = List.of(eventOneMapper, eventTwoMapper, eventThreeMapper);

    public Map<ChannelEvent, EventMapper> events() {
        var executor = eventProcessors.stream()
                .collect(Collectors.toMap(EventMapper::getChannel, Function.identity(),
                        (v1, v2) -> {
                            throw new IllegalStateException("Ops");
                        }, () -> new EnumMap<>(ChannelEvent.class)));
        return executor;
    }
}
