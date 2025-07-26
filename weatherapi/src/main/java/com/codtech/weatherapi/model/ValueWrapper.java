package com.codtech.weatherapi.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ValueWrapper {
	@JsonProperty("value")
	private String value;
}
