package com.codtech.weatherapi.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class NearestArea {
	@JsonProperty("areaName")
	private List<ValueWrapper> areaName;
	@JsonProperty("country")
	private List<ValueWrapper> country;
	@JsonProperty("region")
	private List<ValueWrapper> region;
}
