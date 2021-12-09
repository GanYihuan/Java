package com.qiuzhi70static;

public class Student {
  public static void main(String[] args) {
    String s = "gan";
    System.out.println(Utils.isEmpty(s));
    System.out.println(Utils.test);

    Utils u1 = new Utils();

    Utils.showCount(); // static: 类名加方法名就可以调用
  }
}
