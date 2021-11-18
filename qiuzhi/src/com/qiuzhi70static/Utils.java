package com.qiuzhi70static;

public class Utils {
  public Utils() {
    Utils.count += 1;
  }

  static int test = 10;
  public static int count;

  public static void showCount() {
    // static 方法内部不能有 this 也能有 super
    System.out.println("new: " + Utils.count + " ...");
  }

  public static boolean isEmpty(String s) {
    boolean flag = false;
    if(s != null && s.equals("")) {
      flag = true;
    }
    return flag;
  }
}
