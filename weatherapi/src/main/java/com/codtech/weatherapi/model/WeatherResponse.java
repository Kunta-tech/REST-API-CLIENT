package com.codtech.weatherapi.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class WeatherResponse {
	@JsonProperty("current_condition")
    public List<CurrentCondition> currentCondition;
	@JsonProperty("nearest_area")
    public List<NearestArea> nearestArea;
}
