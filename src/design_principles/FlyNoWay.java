package design_principles;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
