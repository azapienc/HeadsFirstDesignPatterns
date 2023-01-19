 package observer_pattern_alternative.classes;

import java.util.ArrayList;

import observer_pattern_alternative.interfaces.DisplayElement;
import observer_pattern_alternative.interfaces.Observer;
import observer_pattern_alternative.interfaces.Subject;



/**
 * StatisticsDisplay
 */
public class StatisticsDisplay implements Observer, DisplayElement{
  private ArrayList<Float> temperature = new ArrayList<>();
  private ArrayList<Float> humidity = new ArrayList<>();
  private WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    Float averageTemperature = 0f;
    Float averageHumidity = 0f;
    
    averageTemperature = this.temperature.stream().reduce((a, b) -> a + b).get() / this.temperature.size();

    averageHumidity = this.humidity.stream().reduce((a, b) -> a + b).get() / this.humidity.size();

    System.out.println("The average temperatue is " + averageTemperature + "F and averate humidity is " + averageHumidity + "%");
  }

  @Override
  public void update() {
    this.temperature.add(weatherData.getTemperature());
    this.humidity.add(weatherData.getHumidity());
    display();
  }
  
}
