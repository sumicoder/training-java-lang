public class PersonExtends extends Person {
  private int stuNo;

  public void setStuNo(int n) {
    this.stuNo = n;
  }

  public void displayStuNo() {
    System.out.println("学籍番号：" + stuNo);
  }

  public PersonExtends() {
    this(""); // 名前を空文字列で初期化
  }

  public PersonExtends(String n) {
    this(n, 0); // 名前を引数で初期化し、学籍番号を0で初期化
  }

  public PersonExtends(String n, int s) {
    super(n);
    this.stuNo = s;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }
}
