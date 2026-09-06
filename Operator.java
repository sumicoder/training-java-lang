public class Operator {
  public static void main(String[] args) {
    // 引数を数値に変換して加算する
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("========== 算術演算子 ==========");
    // 定義
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    // 加算
    System.out.println("a + b = " + (a + b));
    // 減算
    System.out.println("a - b = " + (a - b));
    // 乗算
    System.out.println("a * b = " + (a * b));
    // 除算
    System.out.println("a / b = " + (a / b));
    // 剰余
    System.out.println("a % b = " + (a % b));
    // インクリメント（出力した後にインクリメント）
    System.out.println("a++ = " + (a++));
    a = Integer.parseInt(args[0]); // 元の値に戻す
    // デクリメント（出力した後にデクリメント）
    System.out.println("a-- = " + (a--));
    a = Integer.parseInt(args[0]); // 元の値に戻す
    // 前置インクリメント
    System.out.println("++a = " + (++a));
    a = Integer.parseInt(args[0]); // 元の値に戻す
    // 前置デクリメント
    System.out.println("--a = " + (--a));
    a = Integer.parseInt(args[0]); // 元の値に戻す
    System.out.println("a == b = " + (a == b));
    System.out.println("a != b = " + (a != b));
    System.out.println("a > b = " + (a > b));
    System.out.println("a < b = " + (a < b));
    System.out.println("a >= b = " + (a >= b));
    System.out.println("a <= b = " + (a <= b));
    System.out.println("a ^ b = " + (a ^ b));
    System.out.println("a & b = " + (a & b));
    System.out.println("a | b = " + (a | b));
    System.out.println("a << b = " + (a << b));
    System.out.println("a >> b = " + (a >> b));
    System.out.println("a >>> b = " + (a >>> b));
  }
}
