package com.temi.weatherbot.service;

import com.temi.weatherbot.output.WeatherResponseBean;

public interface WeatherService {

    public WeatherResponseBean getWeather(String latitude,
                                          String longitude,
                                          String pastDays,
                                          String temperatureUnit,
                                          String daily,
                                          String hourly);
}
