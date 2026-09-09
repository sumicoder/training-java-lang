public class StudentInterface implements Englishable {
  private String name;

  public StudentInterface(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("名前：" + name);
  }

  public void displayEnglish() {
    System.out.println(Englishable.LANGUAGE);
    System.out.println("Name：" + name);
  }
}
