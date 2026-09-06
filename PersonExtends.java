public class PersonExtends extends Person {
  private int stuNo;

  public void setStuNo(int n) {
    this.stuNo = n;
  }

  public void displayStuNo() {
    System.out.println("学籍番号：" + stuNo);
  }
}
