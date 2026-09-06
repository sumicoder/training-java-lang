public class StudentStatic {
  // メンバ変数（変数）
  String name;
  static int counter = 0;

  // メソッド（操作）
  static void display() {
    System.out.println("現在の学生数：" + counter);
  }

  StudentStatic(String name) {
    this.name = name;
    counter++;
    System.out.println("新しい学生" + name + "さんが追加されました。人数：" + counter);
  }
}
