package ru.promo.teamspace.mailadapter.Events;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventTwo implements IEvent {
    private String title;
    private String description;
    private String profile;
    private String dateTime;
    private String status;
    private String comment;
}
