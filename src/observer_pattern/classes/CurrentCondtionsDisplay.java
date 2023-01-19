package observer_pattern.classes;


import observer_pattern.interfaces.DisplayElement;
import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

/**
 * CurrentControlDisplay
 */
public class CurrentCondtionsDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentCondtionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  
}
