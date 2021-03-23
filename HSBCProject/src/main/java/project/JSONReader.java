package project;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONReader {

	public static void main(String[] args)  {
		Logger logger = LogManager.getLogger("NumberOfCities");
		Weather weather = OpenData("https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22");
		int index = 0;
		for (int i=0;i<weather.getList().length;i++) {
			if (weather.getList()[i].getName().startsWith("T")) {
				index++;
			}
		}
		logger.info("Number is " + index);
	}
	
	public static Weather readFromJSONFile(InputStreamReader in) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(in, Weather.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	public static Weather OpenData(String url) {
		try {
			URL u = new URL(url);
			InputStream in;
			try {
				in = u.openStream();
				InputStreamReader file = new InputStreamReader(in, Charset.forName("UTF-8"));
				return readFromJSONFile(file);
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
	

