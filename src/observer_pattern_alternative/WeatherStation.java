 package observer_pattern_alternative;

import observer_pattern_alternative.classes.CurrentCondtionsDisplay;
import observer_pattern_alternative.classes.StatisticsDisplay;
import observer_pattern_alternative.classes.WeatherData;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentCondtionsDisplay currentDisplay = new CurrentCondtionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

    // weather updates
    weatherData.setMeasurement(80, 65, 30.4f);
    weatherData.setMeasurement(82, 70, 29.3f);
    weatherData.setMeasurement(90, 70, 29.3f);
  }
}
