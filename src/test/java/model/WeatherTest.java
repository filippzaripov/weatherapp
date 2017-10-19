package model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Филипп on 19.10.2017.
 */
public class WeatherTest {

    @Test
    public void getCurrentWeather() {
        Weather weather = new Weather();
        Assert.assertNotNull(Weather.getCurrentWeather("Kazan"));
    }

}