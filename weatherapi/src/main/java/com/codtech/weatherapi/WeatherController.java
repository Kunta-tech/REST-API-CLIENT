package com.codtech.weatherapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codtech.weatherapi.model.WeatherResponse;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{location}")
    public WeatherResponse getWeather(@PathVariable String location) {
        try {
            return weatherService.getWeather(location);
        } catch (Exception e) {
        	e.printStackTrace(); // Log full stack trace
            throw new RuntimeException("Error fetching weather for: " + location);
        }
    }
}

