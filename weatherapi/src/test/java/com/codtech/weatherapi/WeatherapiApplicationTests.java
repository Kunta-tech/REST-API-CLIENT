package com.codtech.weatherapi;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import com.codtech.weatherapi.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WeatherapiApplicationTests {

    @Autowired
    private WeatherService weatherService;

    @Test
    void testInvalidLocationShouldNotThrowException() {
        assertDoesNotThrow(() -> {
            weatherService.getWeather("invalid$$$");
        });
    }
}
