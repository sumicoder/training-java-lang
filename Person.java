public class Person {
  private String name;

  public void setName(String n) {
     this.name = n;
  }

  public Person(String n) {
    this.name = n;
  }

  public String getName() {
    return name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }
}
