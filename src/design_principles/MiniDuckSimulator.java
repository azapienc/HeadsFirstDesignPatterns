package design_principles;

/**
 * MiniDuckSimulator
 */
public class MiniDuckSimulator {

  public static void main(String[] args) {
    System.out.println("<< Mallard duck >>");
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    System.out.println("<< Model duck >>");
    Duck model = new ModelDuck();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
