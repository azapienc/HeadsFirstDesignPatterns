package factory_pattern.pizzas;

import factory_pattern.Pizza;
import factory_pattern.PizzaIngredientsFactory;

public class ClamPizza extends Pizza {
  PizzaIngredientsFactory pizzaIngredientsFactory;

  public ClamPizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
    this.pizzaIngredientsFactory = pizzaIngredientsFactory;
  }

  @Override
  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientsFactory.createDough();
    sauce = pizzaIngredientsFactory.createSauce();
    cheese = pizzaIngredientsFactory.createCheese();
    clam = pizzaIngredientsFactory.createClam();
  }
  
}
