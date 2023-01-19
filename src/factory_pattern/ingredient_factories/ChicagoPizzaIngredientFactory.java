package factory_pattern.ingredient_factories;

import factory_pattern.PizzaIngredientsFactory;
import factory_pattern.ingredients.BlackOlives;
import factory_pattern.ingredients.EggPlant;
import factory_pattern.ingredients.FrozenClams;
import factory_pattern.ingredients.MozzarellaCheese;
import factory_pattern.ingredients.PlumTomatoSauce;
import factory_pattern.ingredients.SlicedPepperoni;
import factory_pattern.ingredients.Spinach;
import factory_pattern.ingredients.ThickCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientsFactory  {

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies() {
    Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
    return veggies;
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam() {
    return new FrozenClams();
  }
  
}
