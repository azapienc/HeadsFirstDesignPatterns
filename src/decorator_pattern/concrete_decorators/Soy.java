package decorator_pattern.concrete_decorators;

import decorator_pattern.Beverage;
import decorator_pattern.decorators.CondimentDecorator;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.15;
  }

}
