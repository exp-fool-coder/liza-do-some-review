package ru.promo.teamspace.mailadapter.Entity;

import lombok.Data;
import org.json.JSONObject;

@Data
public class EventEntity {

    private String title;
    private String description;
    private String profile;
    private String dateTime;
    private JSONObject context;
}
