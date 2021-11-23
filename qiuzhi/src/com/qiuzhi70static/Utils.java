package com.qiuzhi70static;

public class Utils {
  public Utils() {
    Utils.count += 1;
  }

  static int test = 10;
  public static int count;

  /**
   * static 方法内部不能有 this & super
   */
  public static void showCount() {
    System.out.println("new: " + Utils.count + " ...");
  }

  /**
   * static: 类名加方法名就可以调用
   * @param s
   * @return
   */
  public static boolean isEmpty(String s) {
    boolean flag = false;
    if(s != null && s.equals("")) {
      flag = true;
    }
    return flag;
  }
}
