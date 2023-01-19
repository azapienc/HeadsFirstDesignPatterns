package singleton_pattern;

public class demo {
  public static void main(String[] args) {
    SingletonEnum singleton = SingletonEnum.UNIQUE;
    SingletonEnum singleton2 = SingletonEnum.UNIQUE;
    
    singleton.setName("This is the one and only D O double G");
    System.out.println(singleton.getName());
    System.out.println(singleton2.getName());
  }
}
