package factory_pattern.pizzas;

import factory_pattern.Pizza;

/**
 * NYVeegiePizza
 */
public class NYVeegiePizza extends Pizza{

  public NYVeegiePizza() {
    name = "Ny Style Sauce and Veggie pizza";
    dough = "Thin crust dough";
    sauce = "Marinada sauce";
    toppings.add("All kind of veggies");
  }

  
}
