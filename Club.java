public abstract class Club {
  private String name;

  public Club(String name) {
    this.name = name;
  }

  public void display() {
    System.out.println("部活動名：" + name);
  }

  public abstract void practice();

}
