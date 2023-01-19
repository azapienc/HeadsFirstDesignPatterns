package factory_pattern.stores;

import factory_pattern.Pizza;
import factory_pattern.PizzaIngredientsFactory;
import factory_pattern.PizzaStore;
import factory_pattern.ingredient_factories.NYPizzaIngredientFactory;
import factory_pattern.pizzas.CheesePizza;
import factory_pattern.pizzas.ClamPizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientsFactory pizzaIngredientsFactory = new NYPizzaIngredientFactory();

    if (type.equals("cheese")) {
      pizza = new CheesePizza(pizzaIngredientsFactory);
      pizza.setName("New York Style Cheese Pizza");

    } else if (type.equals("clam")) {
      pizza = new ClamPizza(pizzaIngredientsFactory);
      pizza.setName("New York Style Clam Pizza");

    }
    return pizza;
  }

}
