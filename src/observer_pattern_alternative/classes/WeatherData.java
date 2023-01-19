 package observer_pattern_alternative.classes;

import java.util.ArrayList;

import observer_pattern.interfaces.Observer;
import observer_pattern.interfaces.Subject;

public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(i);
    }
  }

  @Override
  public void updateObservers() {
    // this may be changed to functional
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public void measurementsChanged() {
    updateObservers();
  }

  public void setMeasurement(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public ArrayList getObservers() {
    return observers;
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
