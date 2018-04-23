public class Greet {

  private String name;

  public Greet(String name) {
    this.name = name;
  }

  public void greetInput(String inputOne, String inputTwo) {
    System.out.println(inputOne);
    System.out.println(inputTwo);
  }

  public void greetName() {
    System.out.println("Greetings");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
