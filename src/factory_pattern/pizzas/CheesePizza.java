package factory_pattern.pizzas;

import factory_pattern.Pizza;
import factory_pattern.PizzaIngredientsFactory;

public class CheesePizza extends Pizza{
  PizzaIngredientsFactory pizzaIngredientsFactory;

  public CheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory) {
    this.pizzaIngredientsFactory = pizzaIngredientsFactory;
  }

  @Override
  protected void prepare() {
    System.out.println("Preparing " + name);
    dough = pizzaIngredientsFactory.createDough();
    sauce = pizzaIngredientsFactory.createSauce();
    cheese = pizzaIngredientsFactory.createCheese();
  }
  
}
