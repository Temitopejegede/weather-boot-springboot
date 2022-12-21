package com.temi.weatherbot.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.SplittableRandom;

@Getter
@Setter
@Data
public class CurrentWeatherBean {

    @JsonProperty("temperature")
    private String temperature;

    @JsonProperty("windspeed")
    private String windSpeed;

    @JsonProperty("winddirection")
    private String windDirection;

    @JsonProperty("weathercode")
    private String weatherCode;

    @JsonProperty("time")
    private String time;

}
