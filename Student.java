public class Student {
  // メンバ変数（変数）
  String name;
  int engScore;
  int mathScore;

  // メソッド（操作）
  void display() {
    System.out.println("名前：" + name);
    System.out.println("英語得点：" + engScore + "・数学得点：" + mathScore);
  }

  void setScore(int eng, int math) {
    this.engScore = eng;
    this.mathScore = math;
  }

  double getAverage() {
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }

  void setData(String name) {
    this.name = name;
  }

  void setData(String name, int eng, int math) {
    this.name = name;
    this.engScore = eng;
    this.mathScore = math;
  }
}
