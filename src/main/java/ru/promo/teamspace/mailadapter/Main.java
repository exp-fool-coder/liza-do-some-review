package ru.promo.teamspace.mailadapter;

import ru.promo.teamspace.mailadapter.Events.EventOne;
import ru.promo.teamspace.mailadapter.Events.EventThree;
import ru.promo.teamspace.mailadapter.Events.EventTwo;
import ru.promo.teamspace.mailadapter.Events.handler.EventOneContextGetter;
import ru.promo.teamspace.mailadapter.Events.handler.EventThreeContextGetter;
import ru.promo.teamspace.mailadapter.Events.handler.EventTwoContextGetter;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final EventMapper<EventOne> eventOneMapper = new EventMapper<>(new EventOneContextGetter());
    private static final EventMapper<EventTwo> eventTwoMapper = new EventMapper<>(new EventTwoContextGetter());
    private static final EventMapper<EventThree> eventThreeMapper = new EventMapper<>(new EventThreeContextGetter());

    public static void main(String[] args) {
        var eventOne = new EventOne(
                "test",
                "test",
                "test",
                "test",
                true,
                10
        );
        var eventOneEntity = eventOneMapper.mapToEntity(eventOne);


        var eventTwo = new EventTwo(
                "test",
                "test",
                "test",
                "test",
                "test",
                "test"
        );
        var eventTwoEntity = eventTwoMapper.mapToEntity(eventTwo);


        var eventThree = new EventThree(
                "test",
                "test",
                "test",
                "test",
                "test",
                "test"
        );
        var eventThreeEntity = eventThreeMapper.mapToEntity(eventThree);

    }
}