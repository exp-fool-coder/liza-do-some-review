package ru.promo.teamspace.mailadapter.Events;

import ru.promo.teamspace.mailadapter.config.EventConfig;

import static ru.promo.teamspace.mailadapter.Events.ChannelEvent.CHANNEL_ONE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    private static final AbstractProcessor<EventOne> eventOneMapper = new AbstractProcessor<>(new EventOneContextGetter());
//    private static final AbstractProcessor<EventTwo> eventTwoMapper = new AbstractProcessor<>(new EventTwoContextGetter());
//    private static final AbstractProcessor<EventThree> eventThreeMapper = new AbstractProcessor<>(new EventThreeContextGetter());
//
    public static void main(String[] args) {
        var eventOne = new EventOne(
                "test",
                "test",
                "test",
                "test",
                true,
                10
        );
        var chanelOne = CHANNEL_ONE;

        var processors = new EventConfig().events();

        var processorOne = processors.get(chanelOne);


        var result = processorOne.mapToEntity(eventOne);
        System.out.println(result);
    }
}