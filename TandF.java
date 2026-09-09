public class TandF extends Club implements Englishable {
  public TandF(String name) {
    super(name);
  }

  public void practice() {
    System.out.println("[日本語]");
    System.out.println("フォームアップ");
    System.out.println("インターバル");
    System.out.println("トレーニング");
  }

  public void displayEnglish() {
    System.out.println(Englishable.LANGUAGE);
    System.out.println("Form Up");
    System.out.println("Interval");
    System.out.println("Training");
  }
}
