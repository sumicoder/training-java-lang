public class StuSample {
  public static void main(String[] args) {
    // System.out.println("========== 学生の成績管理 ==========");
    // Student student = new Student();
    // student.setData("山田太郎");
    // student.setScore(80, 70);
    // student.display();
    // System.out.println("平均点：" + student.getAverage());
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（オーバーロード） ==========");
    // Student studentOverload = new Student();
    // studentOverload.setData("佐藤花子", 90, 50);
    // studentOverload.display();
    // System.out.println("平均点：" + studentOverload.getAverage());
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（コンストラクタ） ==========");
    // StudentConstructor studentConstructor = new StudentConstructor("鈴木次郎", 80, 60);
    // studentConstructor.display();
    // System.out.println("平均点：" + studentConstructor.getAverage());
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（静的） ==========");
    // StudentStatic.display();
    // new StudentStatic("山田太郎");
    // StudentStatic.display();
    // new StudentStatic("佐藤花子");
    // StudentStatic.display();
    // new StudentStatic("鈴木次郎");
    // StudentStatic.display();
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（カプセル化） ==========");
    // StudentCapsule studentCapsule = new StudentCapsule("山田太郎", 80);
    // studentCapsule.display();
    // studentCapsule.setScore(90);
    // // studentCapsule.score = 101; // privateなので外部からアクセスできない
    // studentCapsule.display();
    // studentCapsule.setScore(101);
    // studentCapsule.display();
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（継承） ==========");
    // PersonExtends studentExtends = new PersonExtends();
    // studentExtends.setName("山田太郎");
    // studentExtends.display(); // 継承前のdisplayメソッドを呼び出す
    // studentExtends.setStuNo(123456);
    // studentExtends.displayStuNo(); // 学籍番号だけ
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（オーバーライド） ==========");
    // PersonExtends studentExtendsOverride = new PersonExtends();
    // studentExtendsOverride.setName("山田太郎");
    // studentExtendsOverride.setStuNo(123456);
    // studentExtendsOverride.display(); // 名前と学籍番号
    // System.out.println("--------------------------------");
    System.out.println("========== 学生の成績管理（コンストラクタ） ==========");
    PersonExtends studentExtendsConstructor1 = new PersonExtends();
    studentExtendsConstructor1.display(); // 名前：、学籍番号：0
    PersonExtends studentExtendsConstructor2 = new PersonExtends("山田太郎");
    studentExtendsConstructor2.display(); // 名前：山田太郎、学籍番号：0
    PersonExtends studentExtendsConstructor3 = new PersonExtends("山田太郎", 123456);
    studentExtendsConstructor3.display(); // 名前：山田太郎、学籍番号：123456
    System.out.println("--------------------------------");
  }
}
