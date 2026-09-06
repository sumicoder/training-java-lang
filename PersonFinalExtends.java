public final class PersonFinalExtends extends PersonFinal {
  private int stuNo;

  public PersonFinalExtends(String n, int s) {
    super(n);
    this.stuNo = s;
  }

  public void display() {
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }
}
