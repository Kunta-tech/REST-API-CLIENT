package com.codtech.weatherapi;

import com.codtech.weatherapi.model.WeatherResponse;
import com.codtech.weatherapi.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherServiceIntegrationTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    void testGetWeatherForValidLocation() throws Exception {
        WeatherResponse response = weatherService.getWeather("Kolkata");
        assertNotNull(response);
        assertNotNull(response.getCurrentCondition());
        assertFalse(response.getCurrentCondition().isEmpty());

        var condition = response.getCurrentCondition().get(0);
        assertNotNull(condition.getTempC());
        assertNotNull(condition.getTempF());
    }
}
