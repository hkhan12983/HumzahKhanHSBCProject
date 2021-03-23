package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
	
	public float temp;
	public float temp_min;
	public float temp_max;
	public float pressure;
	public float sea_level;
	public float ground_level;
	public int humidity;
	
	@JsonCreator
	public Main(@JsonProperty("temp") float temp, @JsonProperty("temp_min") float temp_min, @JsonProperty("temp_max") float temp_max, @JsonProperty("pressure") float pressure, @JsonProperty("sea_level") float sea_level, @JsonProperty("grnd_level") float ground_level, @JsonProperty("humidity") int humidity) {
		super();
		this.temp = temp;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.sea_level = sea_level;
		this.ground_level = ground_level;
		this.humidity = humidity;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}
	public float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public float getSea_level() {
		return sea_level;
	}
	public void setSea_level(float sea_level) {
		this.sea_level = sea_level;
	}
	public float getGround_level() {
		return ground_level;
	}
	public void setGround_level(float ground_level) {
		this.ground_level = ground_level;
	}
	
	

}
