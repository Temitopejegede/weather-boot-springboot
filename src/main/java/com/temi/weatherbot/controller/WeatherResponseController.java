package com.temi.weatherbot.controller;

import com.temi.weatherbot.output.WeatherResponseBean;
import com.temi.weatherbot.service.impl.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherResponseController {

    @Autowired
    WeatherServiceImpl weatherServiceImpl;

    @GetMapping("/byCoordinates")
    public WeatherResponseBean getWeather(@RequestParam(required = true, name = "latitude") String latitude,
                                          @RequestParam(required = true, name = "longitude") String longitude,
                                          @RequestParam(required = false, defaultValue = "fahrenheit", name = "temperature_unit") String temperatureUnit,
                                          @RequestParam(required = false, defaultValue = "2", name = "past_days") String pastDays,
                                          @RequestParam(required = false, defaultValue = "temperature_2m_max", name = "daily") String daily,
                                          @RequestParam(required = false, defaultValue = "temperature_2m", name = "hourly") String hourly){

        WeatherResponseBean weatherResponseBean;

        weatherResponseBean = weatherServiceImpl.getWeather(latitude, longitude, temperatureUnit, pastDays, daily, hourly);

        return weatherResponseBean;
    }
}
