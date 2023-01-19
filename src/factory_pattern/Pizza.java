package factory_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import factory_pattern.ingredient_factories.Cheese;
import factory_pattern.ingredient_factories.Clams;
import factory_pattern.ingredient_factories.Dough;
import factory_pattern.ingredient_factories.Pepperoni;
import factory_pattern.ingredient_factories.Sauce;
import factory_pattern.ingredient_factories.Veggies;

public abstract class Pizza {
  protected String name;
  
  protected Dough dough;
  protected Sauce sauce;
  protected Veggies veggies[];
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clam;

  protected abstract void prepare(); 

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Pizza [name=" + name + ", dough=" + dough + ", sauce=" + sauce + ", veggies=" + Arrays.toString(veggies)
        + ", cheese=" + cheese + ", pepperoni=" + pepperoni + ", clam=" + clam + "]";
  }

}
