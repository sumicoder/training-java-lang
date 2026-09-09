import StudentPackage.*;
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
    // System.out.println("========== 学生の成績管理（コンストラクタ） ==========");
    // PersonExtends studentExtendsConstructor1 = new PersonExtends();
    // studentExtendsConstructor1.display(); // 名前：、学籍番号：0
    // PersonExtends studentExtendsConstructor2 = new PersonExtends("山田太郎");
    // studentExtendsConstructor2.display(); // 名前：山田太郎、学籍番号：0
    // PersonExtends studentExtendsConstructor3 = new PersonExtends("山田太郎", 123456);
    // studentExtendsConstructor3.display(); // 名前：山田太郎、学籍番号：123456
    // System.out.println("--------------------------------");
    // System.out.println("========== 学生の成績管理（final） ==========");
    // final int BASE_STU_NO = 100000;
    // PersonFinalExtends studentFinalExtends1 = new PersonFinalExtends("山田太郎", BASE_STU_NO);
    // studentFinalExtends1.display(); // 名前：山田太郎、学籍番号：100000
    // PersonFinalExtends studentFinalExtends2 = new PersonFinalExtends("佐藤花子", BASE_STU_NO + 1);
    // studentFinalExtends2.display(); // 名前：佐藤花子、学籍番号：100001
    // // BASE_STU_NO = 1000; // finalなので変更できないのでエラー
    // PersonFinalExtends studentFinalExtends3 = new PersonFinalExtends("鈴木次郎", BASE_STU_NO + 2);
    // studentFinalExtends3.display(); // 名前：鈴木次郎、学籍番号：100002
    // System.out.println("--------------------------------");
    // System.out.println("========== キャスト ==========");
    // PersonExtends personCast = new PersonExtends("山田太郎");
    // Person psnCast = personCast;
    // PersonExtends personCast2 = (PersonExtends) psnCast;
    // psnCast.display();
    // // psnCast.setStuNo(999999);
    // personCast2.setStuNo(999999);
    // personCast2.display();
    // System.out.println("--------------------------------");
    // System.out.println("========== 抽象クラス ==========");
    // TandF tandF = new TandF("陸上競技部");
    // Football football = new Football("サッカー部");
    // Baseball baseball = new Baseball("野球部");
    // StudentPolymorphism studentPolymorphism1 = new StudentPolymorphism("山田太郎", tandF);
    // studentPolymorphism1.display();
    // studentPolymorphism1.practice();
    // System.out.println("--------------------------------");
    // StudentPolymorphism studentPolymorphism2 = new StudentPolymorphism("佐藤花子", football);
    // studentPolymorphism2.display();
    // studentPolymorphism2.practice();
    // System.out.println("--------------------------------");
    // StudentPolymorphism studentPolymorphism3 = new StudentPolymorphism("鈴木次郎", baseball);
    // studentPolymorphism3.display();
    // studentPolymorphism3.practice();
    // System.out.println("--------------------------------");
    // System.out.println("========== インターフェース ==========");
    // StudentInterface studentInterface = new StudentInterface("山田太郎");
    // studentInterface.displayEnglish();
    // System.out.println("--------------------------------");
    // TandF tandF = new TandF("陸上競技部");
    // tandF.practice();
    // tandF.displayEnglish();
    // System.out.println("--------------------------------");
    // Football football = new Football("サッカー部");
    // football.practice();
    // football.displayEnglish();
    // System.out.println("--------------------------------");
    StudentPack studentPackage = new StudentPack("山田太郎");
    studentPackage.display();
  }
}
