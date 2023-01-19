 package observer_pattern_alternative.classes;

import java.util.ArrayList;

import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

/**
 * StatisticsDisplay
 */
public class StatisticsDisplay implements Observer, DisplayElement{
  private ArrayList<Float> temperature = new ArrayList<>();
  private ArrayList<Float> humidity = new ArrayList<>();
  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
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
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }
  
}
