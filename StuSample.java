public class StuSample {
  public static void main(String[] args) {
    System.out.println("========== 学生の成績管理 ==========");
    Student student = new Student();
    student.setData("山田太郎");
    student.setScore(80, 70);
    student.display();
    System.out.println("平均点：" + student.getAverage());
    System.out.println("--------------------------------");
    System.out.println("========== 学生の成績管理（オーバーロード） ==========");
    Student studentOverload = new Student();
    studentOverload.setData("佐藤花子", 90, 50);
    studentOverload.display();
    System.out.println("平均点：" + studentOverload.getAverage());
    System.out.println("--------------------------------");
    System.out.println("========== 学生の成績管理（コンストラクタ） ==========");
    StudentConstructor studentConstructor = new StudentConstructor("鈴木次郎", 80, 60);
    studentConstructor.display();
    System.out.println("平均点：" + studentConstructor.getAverage());
    System.out.println("--------------------------------");
    System.out.println("========== 学生の成績管理（静的） ==========");
    StudentStatic.display();
    new StudentStatic("山田太郎");
    StudentStatic.display();
    new StudentStatic("佐藤花子");
    StudentStatic.display();
    new StudentStatic("鈴木次郎");
    StudentStatic.display();
    System.out.println("--------------------------------");
    System.out.println("========== 学生の成績管理（カプセル化） ==========");
    StudentCapsule studentCapsule = new StudentCapsule("山田太郎", 80);
    studentCapsule.display();
    studentCapsule.setScore(90);
    // studentCapsule.score = 101; // privateなので外部からアクセスできない
    studentCapsule.display();
    studentCapsule.setScore(101);
    studentCapsule.display();
    System.out.println("--------------------------------");
  }
}
