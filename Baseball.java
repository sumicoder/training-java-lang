public class Baseball extends Club implements Englishable {
  public Baseball(String name) {
    super(name);
  }

  public void practice() {
    System.out.println("[日本語]");
    System.out.println("バッティング練習");
    System.out.println("守備練習");
    System.out.println("走塁練習");
  }

  public void displayEnglish() {
    System.out.println(Englishable.LANGUAGE);
    System.out.println("Batting Practice");
    System.out.println("Defense Practice");
    System.out.println("Running Practice");
  }
}
