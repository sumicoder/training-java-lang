public class StudentCapsule {
  // メンバ変数（変数）
  private String name;
  private int score;

  // メソッド（操作）
  void display() {
    System.out.println("名前：" + name);
    System.out.println("得点：" + score);
  }

  public void setScore(int s) {
    if (0 <= s && s <= 100) {
      this.score = s;
    } else {
      System.out.println("得点は0から100の間で入力してください。" + s + "は無効です。");
      this.score = s; // 無効な得点を設定しても、エラーメッセージを表示してから設定する
    }
  }

  StudentCapsule(String name, int score) {
    this.name = name;
    this.score = score;
  }
}
