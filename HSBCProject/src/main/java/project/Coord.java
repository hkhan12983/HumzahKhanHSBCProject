package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord {
	
	public float lon;
	public float lat;
	
	@JsonCreator
	public Coord(@JsonProperty("lon") float lon, @JsonProperty("lat") float lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}
	

}
