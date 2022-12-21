package com.temi.weatherbot.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class HourlyUnitsBean {

    @JsonProperty("time")
    private String time;

    @JsonProperty("temperature_2m")
    private String temperature_2m;


}
