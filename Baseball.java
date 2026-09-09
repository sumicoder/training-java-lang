public class Baseball extends Club {
  public Baseball(String name) {
    super(name);
  }

  public void practice() {
    System.out.println("バッティング練習");
    System.out.println("守備練習");
    System.out.println("走塁練習");
  }
}
