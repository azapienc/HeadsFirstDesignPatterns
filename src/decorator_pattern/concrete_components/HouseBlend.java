package decorator_pattern.concrete_components;

import decorator_pattern.Beverage;

/**
 * HouseBlend
 */
public class HouseBlend extends Beverage{

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
  
}
