package com.codtech.weatherapi.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CurrentCondition {
	@JsonProperty("FeelsLikeC")
    private String feelsLikeC;
	@JsonProperty("FeelsLikeF")
    private String feelsLikeF;
	@JsonProperty("cloudcover")
    private String cloudcover;
	@JsonProperty("humidity")
    private String humidity;
	@JsonProperty("localObsDateTime")
    private String localObsDateTime;
    @JsonProperty("observation_time")
    private String observationTime;
    @JsonProperty("precipInches")
    private String precipInches;
    @JsonProperty("precipMM")
    private String precipMM;
    @JsonProperty("pressure")
    private String pressure;
    @JsonProperty("pressureInches")
    private String pressureInches;
    @JsonProperty("temp_C")
    private String tempC;
    @JsonProperty("temp_F")
    private String tempF;
    @JsonProperty("uvIndex")
    private String uvIndex;
    @JsonProperty("visibility")
    private String visibility;        // in KM
    @JsonProperty("visibilityMiles")
    private String visibilityMiles;
    @JsonProperty("weatherCode")
    private String weatherCode;
    @JsonProperty("weatherDesc")
    private List<ValueWrapper> weatherDesc;
    @JsonProperty("weatherIconUrl")
    private List<ValueWrapper> weatherIconUrl;
    @JsonProperty("winddir16Point")
    private String winddir16Point;
    @JsonProperty("winddirDegree")
    private String winddirDegree;
    @JsonProperty("windspeedKmph")
    private String windspeedKmph;
    @JsonProperty("windspeedMiles")
    private String windspeedMiles;
}
