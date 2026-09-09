public abstract class Club {
  /** 部活動名 */
  private String name;

  /**
   * コンストラクタ
   * @param name 部活動名
   */
  public Club(String name) {
    this.name = name;
  }

  /**
   * 部活動名を表示
   */
  public void display() {
    System.out.println("部活動名：" + name);
  }

  /**
   * 部活動を実施
   */
  public abstract void practice();

}
