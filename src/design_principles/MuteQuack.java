package design_principles;

/**
 * MuteQuack
 */
public class MuteQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("<< silence >>");

  }

}
