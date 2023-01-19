package decorator_pattern.concrete_components;

import decorator_pattern.Beverage;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark Roast";
  }

  @Override
  public double cost() {
    return 0.99;
  }

}
