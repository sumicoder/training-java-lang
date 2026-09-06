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
    Student student2 = new Student();
    student2.setData("佐藤花子", 90, 50);
    student2.display();
    System.out.println("平均点：" + student2.getAverage());
  }
}
