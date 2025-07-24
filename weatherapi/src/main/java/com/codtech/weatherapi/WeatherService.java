package com.codtech.weatherapi;
import org.springframework.stereotype.Service;

import com.codtech.weatherapi.model.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

@Service
public class WeatherService {
    private static final String BASE_URL = "https://wttr.in/%s?format=j2";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public WeatherResponse getWeather(String location) throws IOException {
        String url = String.format(BASE_URL, location);
        return objectMapper.readValue(new URL(url), WeatherResponse.class);
    }
}