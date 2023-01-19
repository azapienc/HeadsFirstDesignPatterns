package factory_pattern;

import factory_pattern.stores.NYPizzaStore;

public class PizzaDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
  
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Armando ordered a " + pizza.getName() + "\n");
    
    pizza = nyStore.orderPizza("clam");
    System.out.println("Armando ordered a " + pizza.getName() + "\n");  }
}
