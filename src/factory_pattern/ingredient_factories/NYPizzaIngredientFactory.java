package factory_pattern.ingredient_factories;

import factory_pattern.PizzaIngredientsFactory;
import factory_pattern.ingredients.FreshClam;
import factory_pattern.ingredients.Garlic;
import factory_pattern.ingredients.MarinaraSauce;
import factory_pattern.ingredients.Mushroom;
import factory_pattern.ingredients.Onion;
import factory_pattern.ingredients.RedPepper;
import factory_pattern.ingredients.ReggianoChesse;
import factory_pattern.ingredients.SlicedPepperoni;
import factory_pattern.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientsFactory{

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoChesse();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FreshClam();
  }   
}
