package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlaceName {
	
	public int id;
	public String name;
	public Coord coord;
	public Main main;
	public int dt;
	public Wind wind;
	public Rain rain;
	public Clouds clouds;
	public WeatherType[] weathertype;
	
	@JsonCreator
	public PlaceName(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("coord") Coord coord, @JsonProperty("main") Main main, @JsonProperty("dt") int dt, @JsonProperty("wind") Wind wind, @JsonProperty("rain") Rain rain, @JsonProperty("clouds") Clouds clouds, @JsonProperty("weather") WeatherType[] weathertype) {
		super();
		this.id = id;
		this.name = name;
		this.coord = coord;
		this.main = main;
		this.dt = dt;
		this.wind = wind;
		this.rain = rain;
		this.clouds = clouds;
		this.weathertype = weathertype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public int getDt() {
		return dt;
	}
	public void setDt(int dt) {
		this.dt = dt;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public WeatherType[] getWeathertype() {
		return weathertype;
	}
	public void setWeathertype(WeatherType[] weathertype) {
		this.weathertype = weathertype;
	}
	
	

}
