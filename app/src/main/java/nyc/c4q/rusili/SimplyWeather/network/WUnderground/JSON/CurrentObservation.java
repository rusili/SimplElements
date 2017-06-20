package nyc.c4q.rusili.SimplyWeather.network.WUnderground.JSON;

public class CurrentObservation {
	String forecast_url;
	String observation_time;
	String weather;
	double temp_f;
	double temp_c;
	String icon;
	String relative_humidity;
	double wind_mph;
	display_location display_location;

	public double getWind_mph () {
		return wind_mph;
	}

	public String getRelative_humidity () {
		return relative_humidity;
	}

	public String getForecast_url () {
		return forecast_url;
	}

	public String getIcon () {
		return icon;
	}

	public double getTemp_c () {
		return temp_c;
	}

	public double getTemp_f () {
		return temp_f;
	}

	public String getWeather () {
		return weather;
	}

	public String getObservation_time () {
		return observation_time;
	}

	public CurrentObservation.display_location getDisplay_location () {
		return display_location;
	}

	public class display_location {
		String city;
		String state;
		String county;
		String zip;
		String latitude;
		String longitude;

		public String getCity () {
			return city;
		}

		public String getState () {
			return state;
		}

		public String getCounty () {
			return county;
		}

		public String getZip () {
			return zip;
		}

		public String getLatitude () {
			return latitude;
		}

		public String getLongitude () {
			return longitude;
		}
	}
}