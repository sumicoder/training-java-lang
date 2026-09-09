public class Football extends Club implements Englishable {
  public Football(String name) {
    super(name);
  }

  public void practice() {
    System.out.println("[日本語]");
    System.out.println("シュート練習");
    System.out.println("パス練習");
    System.out.println("ドリブル練習");
  }

  public void displayEnglish() {
    System.out.println(Englishable.LANGUAGE);
    System.out.println("Shoot Practice");
    System.out.println("Pass Practice");
    System.out.println("Dribble Practice");
  }
}
