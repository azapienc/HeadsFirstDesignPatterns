 package observer_pattern_alternative.classes;

import observer_pattern_alternative.interfaces.DisplayElement;
import observer_pattern_alternative.interfaces.Observer;
import observer_pattern_alternative.interfaces.Subject;

/**
 * CurrentControlDisplay
 */
public class CurrentCondtionsDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentCondtionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  
}
