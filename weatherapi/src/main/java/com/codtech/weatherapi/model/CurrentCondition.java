package com.codtech.weatherapi.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentCondition {
	@JsonProperty("FeelsLikeC")
    private String feelsLikeC;
	
	@JsonProperty("FeelsLikeF")
    private String feelsLikeF;
	
    private String cloudcover;
    private String humidity;
    private String localObsDateTime;
    @JsonProperty("observation_time")
    private String observationTime;
    
    private String precipInches;
    private String precipMM;
    private String pressure;
    private String pressureInches;
    @JsonProperty("temp_C")
    private String tempC;
    @JsonProperty("temp_F")
    private String tempF;
    private String uvIndex;
    private String visibility;        // in KM
    private String visibilityMiles;
    private String weatherCode;
    private List<ValueWrapper> weatherDesc;
    private List<ValueWrapper> weatherIconUrl;
    private String winddir16Point;
    private String winddirDegree;
    private String windspeedKmph;
    private String windspeedMiles;
}
