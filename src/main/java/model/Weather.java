package model;

import net.aksingh.owmjapis.DailyForecast;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.apache.log4j.Logger;
import org.json.JSONException;

import java.io.IOException;

/**
 * Uses for gathering information about current weather from Open Weather Map server using API.
 *
 * @author Filipp Zaripov
 * @version 0.1
 */
public class Weather {
    /** Creation logger that is defined in resources package */
    private static final Logger log = Logger.getLogger(Weather.class);

    /** Determination of API key that is mandatory for getting info from the OWM server */
    private static final String owmApiKey ="bd5e378503939ddaee76f12ad7a97608";


    /**
     * Method that takes information about temperature for city.
     * Works only with russian cities
     *
     * @param city [String] - name of the city
     * @return [String] - Temperature in celsius for city that was provided
     */
    public static String getCurrentWeather(String city){

        String weather ="";
        boolean isMetric = true;
        String weatherCity = city+",RU";
        byte forecastDays = 1;
        OpenWeatherMap.Units units = (isMetric)
                ? OpenWeatherMap.Units.METRIC
                : OpenWeatherMap.Units.IMPERIAL;
        OpenWeatherMap owm = new OpenWeatherMap(units, owmApiKey);
        weather += "Current temperature for " + city+" is ";

        try {
            DailyForecast forecast = owm.dailyForecastByCityName(weatherCity, forecastDays);
            int numForecasts = forecast.getForecastCount();
            for (int i = 0; i < numForecasts; i++) {
                DailyForecast.Forecast dayForecast = forecast.getForecastInstance(i);
                DailyForecast.Forecast.Temperature temperature = dayForecast.getTemperatureInstance();
                weather += ((int)temperature.getDayTemperature() + " °C ");
                log.info("Got weather info about "+ city);
            }
        }
        catch (IOException | JSONException e) {
            e.printStackTrace();
            log.error("Error in try-catch block in Weather class");
        }
        return weather;
    }

}