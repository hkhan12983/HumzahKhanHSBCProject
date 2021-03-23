package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties({"var_beg", "var_end"})

public class Wind {
	public double speed;
	public double deg;
	
	@JsonCreator
	public Wind(@JsonProperty("speed") double speed, @JsonProperty("deg") double deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDeg() {
		return deg;
	}
	public void setDeg(double deg) {
		this.deg = deg;
	}
	
	
}
