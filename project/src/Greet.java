public class Greet {

  private String name;

  public Greet(String name) {
    this.name = name;
  }

  public void greetName() {
    System.out.println(name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
