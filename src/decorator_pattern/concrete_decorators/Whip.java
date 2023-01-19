package decorator_pattern.concrete_decorators;

import decorator_pattern.Beverage;
import decorator_pattern.decorators.CondimentDecorator;

public class Whip extends CondimentDecorator{

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return this.beverage.cost() + 0.10;
  }

  
}
