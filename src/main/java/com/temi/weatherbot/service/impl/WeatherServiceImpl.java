package com.temi.weatherbot.service.impl;

import com.temi.weatherbot.output.WeatherResponseBean;
import com.temi.weatherbot.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("WeatherServiceImpl")
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public WeatherResponseBean getWeather(String latitude,
                                          String longitude,
                                          String temperatureUnit,
                                          String pastDays,
                                          String daily,
                                          String hourly) {

        String url = "https://api.open-meteo.com/v1/forecast?latitude={latitude}&longitude={longitude}&current_weather=true&past_days={pastDays}&" +
                "temperature_unit={temperatureUnit}&daily={daily}&timezone=GMT&hourly={hourly}";
        url = url.replace("{latitude}", latitude);
        url = url.replace("{longitude}", longitude);
        url = url.replace("{pastDays}", pastDays);
        url = url.replace("{temperatureUnit}", temperatureUnit);
        url = url.replace("{daily}", daily);
        url = url.replace("{hourly}", hourly);


        ResponseEntity<WeatherResponseBean> weatherResponseBeanResponseEntity = restTemplate.getForEntity(url, WeatherResponseBean.class);
        System.out.println("Response status is "+ weatherResponseBeanResponseEntity.getStatusCode());
        WeatherResponseBean weatherResponseBean = weatherResponseBeanResponseEntity.getBody();


        return weatherResponseBean;
    }
}
