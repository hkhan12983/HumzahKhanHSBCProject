package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Weather {
	public int cod;
	public float calctime;
	public int cnt;
	public PlaceName[] list;
	
	@JsonCreator
	public Weather(@JsonProperty("cod") int cod, @JsonProperty("calctime") float calctime, @JsonProperty("cnt") int cnt, @JsonProperty("list") PlaceName[] list) {
		super();
		this.cod = cod;
		this.calctime = calctime;
		this.cnt = cnt;
		this.list = list;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public float getCalctime() {
		return calctime;
	}
	public void setCalctime(float calctime) {
		this.calctime = calctime;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public PlaceName[] getList() {
		return list;
	}
	public void setList(PlaceName[] list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Weather [cod=" + cod + ", calctime=" + calctime + ", cnt=" + cnt + ", list=" + list + "]";
	}

	
	
	
}
