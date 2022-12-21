package com.temi.weatherbot.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
public class WeatherResponseBean {

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("generationtime_ms")
    private String generationtime_ms;

    @JsonProperty("utc_offset_seconds")
    private String utc_offset_seconds;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("timezone_abbreviation")
    private String timezone_abbreviation;

    @JsonProperty("elevation")
    private String elevation;

    @JsonProperty("current_weather")
    private CurrentWeatherBean current_weather;

    @JsonProperty("hourly_units")
    private HourlyUnitsBean hourly_units;

    @JsonProperty("hourly")
    private HourlyBean hourly;

    @JsonProperty("daily_units")
    private DailyUnitsBean daily_units;

    @JsonProperty("daily")
    private DailyBean daily;


}


