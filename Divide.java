public class Divide {
  public static void main(String[] args) {
    try {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      if (args.length > 2) {
        throw new IllegalArgumentException("引数が3つ以上あります。");
      }
      System.out.println("計算を開始します。");
      System.out.println("結果：" + (num1 / num2) + "あまり" + (num1 % num2));
      System.out.println("計算を終了します。");
    } catch (NumberFormatException e) {
      System.out.println("--------------------------------");
      System.out.println("数値に変換できません。");
      System.out.println("例外：" + e.getMessage());
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      System.out.println("--------------------------------");
      System.out.println("引数が3つ以上あります。");
      System.out.println("例外：" + e.getMessage());
      e.printStackTrace();
    } catch (ArithmeticException e) {
      System.out.println("--------------------------------");
      System.out.println("0で割れません。");
      System.out.println("例外：" + e.getMessage());
      e.printStackTrace();
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("--------------------------------");
      System.out.println("引数が不足しています。");
      System.out.println("例外：" + e.getMessage());
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("--------------------------------");
      System.out.println("例外：" + e.getMessage());
      e.printStackTrace();
    } finally {
      System.out.println("計算を終了します。");
    }
  }
}
