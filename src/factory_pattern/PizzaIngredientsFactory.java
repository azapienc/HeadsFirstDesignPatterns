package factory_pattern;

import factory_pattern.ingredient_factories.Cheese;
import factory_pattern.ingredient_factories.Clams;
import factory_pattern.ingredient_factories.Dough;
import factory_pattern.ingredient_factories.Pepperoni;
import factory_pattern.ingredient_factories.Sauce;
import factory_pattern.ingredient_factories.Veggies;

public interface PizzaIngredientsFactory {
  public Dough createDough();

  public Sauce createSauce();

  public Cheese createCheese();

  public Veggies[] createVeggies();

  public Pepperoni createPepperoni();

  public Clams createClam();
  
}
