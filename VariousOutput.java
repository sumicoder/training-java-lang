import java.util.Random;

public class VariousOutput {
  public static void main(String[] args) {
    // 改行無し出力
    System.out.println("========== print 改行無し出力 ==========");
    System.out.print("Hello World!");

    // 改行有り出力
    System.out.println();
    System.out.println("========== println 改行有り出力 ==========");
    System.out.println("Hello World!");

    // 引数の数が事前に分からなくても、args.length に合わせて動的に出力する
    // コマンドライン引数は未指定だと配列に入らない（nullではない）ため、
    // args[0] を直接参照せず、for文で配列の要素数だけ繰り返す
    System.out.println("========== 引数を動的に出力する ==========");
    if (args.length == 0) {
      // 引数が1つもない場合
      System.out.println("引数が指定されていません");
    } else {
      // 何個渡されても、配列の長さ分だけ繰り返して出力する
      System.out.println("引数の数: " + args.length);
      for (int argumentIndex = 0; argumentIndex < args.length; argumentIndex++) {
        String currentArgument = args[argumentIndex];
        System.out.println("args[" + argumentIndex + "]: " + currentArgument);
      }

      // すべての引数をスペース区切りで1行にまとめて出力する
      System.out.print("すべての引数: ");
      for (int argumentIndex = 0; argumentIndex < args.length; argumentIndex++) {
        System.out.print(args[argumentIndex]);
        // 最後の引数の後ろにはスペースを付けない
        if (argumentIndex < args.length - 1) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    /*
     * 変数を使用した出力
     */
    System.out.println("========== 変数を使用した出力 ==========");
    int month = 12;
    int day = 31;
    System.out.println(month + "月" + day + "日");

    // 文字列を使用した出力（String型はダブルクオーテーションで囲む）
    System.out.println("========== 文字列を使用した出力 ==========");
    String name = "山田太郎";
    System.out.println("私の名前は" + name + "です。");

    // 文字を使用した出力（char型はシングルクオーテーションで囲む）
    System.out.println("========== 文字を使用した出力 ==========");
    char bloodType = 'A';
    System.out.println("私の血液型は" + bloodType + "型です。");

    // 整数を使用した出力（int型は整数を表す）
    System.out.println("========== 整数を使用した出力 ==========");
    int age = 20;
    System.out.println("私の年齢は" + age + "歳です。");

    // 浮動小数点数を使用した出力（float型はfをつける）
    System.out.println("========== 浮動小数点数を使用した出力 ==========");
    float weight = 70.5f;
    System.out.println("私の体重は" + weight + "kgです。");
    System.out.println("========== 浮動小数点数を使用した出力 ==========");
    double height = 170.5;
    System.out.println("私の身長は" + height + "cmです。");

    // 論理値を使用した出力（boolean型はtrueまたはfalse）
    System.out.println("========== 論理値を使用した出力 ==========");
    boolean isStudent = true;
    System.out.println("私は学生ですか？" + isStudent);

    // 配列を使用した出力（int型の配列は{}で囲む）
    System.out.println("========== 配列を使用した出力（int型の配列は{}で囲む） ==========");
    int[] numbers = { 1, 2, 3, 4, 5 };
    Random random = new Random();
    int randomNumber = random.nextInt(numbers.length);
    System.out.println("私の好きな数字は" + numbers[randomNumber] + "です。");

    /*
     * 多次元配列を使用した出力
     */
    System.out.println("========== 多次元配列を使用した出力 ==========");
    int[][] numbers2 = new int[2][3];
    numbers2[0][0] = 0;
    numbers2[0][1] = 1;
    numbers2[0][2] = 2;
    numbers2[1][0] = 3;
    numbers2[1][1] = 4;
    numbers2[1][2] = 5;
    System.out.println(numbers2[0][0]);
    System.out.println(numbers2[0][1]);
    System.out.println(numbers2[0][2]);
    System.out.println(numbers2[1][0]);
    System.out.println(numbers2[1][1]);
    System.out.println(numbers2[1][2]);

    // 多次元配列の中身をfor文で出力
    String[][] numbers3 = { { "1-1", "1-2", "1-3" }, { "2-1", "2-2", "2-3" }, { "3-1", "3-2", "3-3" } };
    System.out.println("========== 多次元配列の中身をfor文で出力 ==========");
    for (int i = 0; i < numbers3.length; i++) {
      for (int j = 0; j < numbers3[i].length; j++) {
        System.out.print(numbers3[i][j] + ",");
      }
    }
    System.out.println();

    // 多次元配列の中身をwhile文で出力
    System.out.println("========== 多次元配列の中身をwhile文で出力 ==========");
    int i = 0;
    while (i < numbers3.length) {
      int j = 0;
      while (j < numbers3[i].length) {
        System.out.print(numbers3[i][j] + ",");
        j++;
      }
      i++;
    }
    System.out.println();

    // 多次元配列の中身をdo-while文で出力
    System.out.println("========== 多次元配列の中身をdo-while文で出力 ==========");
    i = 0;
    do {
      int j = 0;
      do {
        System.out.print(numbers3[i][j] + ",");
        j++;
      } while (j < numbers3[i].length);
      i++;
    } while (i < numbers3.length);
    System.out.println();
  }
}
