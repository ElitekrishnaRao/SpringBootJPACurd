package com.employeeApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDto {

	private int Id;
	private int Year;
	private String Make;
	private String Model;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getYear() {
		return Year;
	}
	@JsonProperty("Year")
	public void setYear(int year) {
		Year = year;
	}
	public String getMake() {
		return Make;
	}
	@JsonProperty("Make")
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	@JsonProperty("Model")
	public void setModel(String model) {
		Model = model;
	}

	
}
