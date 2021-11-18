package com.qiuzhi70static;

public class Student {
  public static void main(String[] args) {
    String s = "gan";
    System.out.println(Utils.isEmpty(s));
    System.out.println(Utils.test);

    Utils u1 = new Utils();
    Utils u2 = new Utils();
    Utils u3 = new Utils();
    Utils u4 = new Utils();
    Utils u5 = new Utils();

    Utils.showCount();
  }
}
