package singleton_pattern;

public enum SingletonEnum {
  UNIQUE;

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
