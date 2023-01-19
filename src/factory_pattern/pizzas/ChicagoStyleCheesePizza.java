package factory_pattern.pizzas;

import factory_pattern.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish cheese pizza";
    dough = "Extra Thick Crust Dough";
    sauce = "Plum Tomato Sauce";
    toppings.add("Shredded Mozzarela Cheese");
  }

  public void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
