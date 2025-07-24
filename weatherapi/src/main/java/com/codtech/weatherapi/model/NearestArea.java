package com.codtech.weatherapi.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NearestArea {
	private List<ValueWrapper> areaName;
	private List<ValueWrapper> country;
	private List<ValueWrapper> region;
}
