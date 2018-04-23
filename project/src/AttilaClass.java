public class AttilaClass {

  public final int month = 12;
  private final int year = 28;

  public int count(int year, int month){
    return month + year;
  }

  public void printAge(){
    System.out.println(year);
  }

  public void printMonth(){
    System.out.println(month);
  }
}
