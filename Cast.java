public class Cast {
  public static void main(String[] args) {
    System.out.println("========== キャスト ==========");
    int price = Integer.parseInt(args[0]);
    double rate = 0.08; // 税率
    double tax = price * rate;
    int amount = (int) (price + tax);
    System.out.println("price = " + price);
    System.out.println("rate = " + rate);
    System.out.println("tax = " + (int) tax);
    System.out.println("amount = " + amount);
  }
}
