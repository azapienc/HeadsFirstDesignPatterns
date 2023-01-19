package factory_pattern.stores;

import factory_pattern.Pizza;
import factory_pattern.PizzaStore;
import factory_pattern.pizzas.NYSCheesePizza;
import factory_pattern.pizzas.NYVeegiePizza;

public class NYPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new NYSCheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new NYVeegiePizza();
    }
    return pizza;
  }
  
}
