package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {
	
	public float number;

	@JsonCreator
	public Clouds(@JsonProperty("all")float number) {
		super();
		this.number = number;
	}

	public float getNumber() {
		return number;
	}

	public void setNumber(float number) {
		this.number = number;
	}
	

}
