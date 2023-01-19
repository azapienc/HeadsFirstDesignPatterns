package decorator_pattern.decorators;

import decorator_pattern.Beverage;

public abstract class CondimentDecorator extends Beverage {
  protected Beverage beverage;

  @Override
  public abstract String getDescription();

}
