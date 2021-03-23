package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {
	public float hrs;

	@JsonCreator
	public Rain(@JsonProperty("3h") float hrs) {
		super();
		this.hrs = hrs;
	}

	public float getHrs() {
		return hrs;
	}

	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	
}
