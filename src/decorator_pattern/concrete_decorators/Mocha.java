package decorator_pattern.concrete_decorators;

import decorator_pattern.Beverage;
import decorator_pattern.decorators.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.20;
  }

}
