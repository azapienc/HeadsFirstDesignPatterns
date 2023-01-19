package factory_pattern.pizzas;

import factory_pattern.Pizza;

public class NYSCheesePizza extends Pizza{
  public NYSCheesePizza() {
    name = "Ny Style Sauce and Cheese pizza";
    dough = "Thin crust dough";
    sauce = "Marinada sauce";
    toppings.add("Grated Reggiano Cheese");
  }
  
}
