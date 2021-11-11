package com.qiuzhi40OOP;

public class Person {
  public String name; // public 可以被类以外方法访问
  private int age; // private 只能由该类方法访问
  public static String sex = "man"; // static 不需要实例化就可以使用, 直接 . 调用

  public void showName(String name) {
    System.err.println("Name: " + name);
  }

  public int getAge() {
    return age;
  }
}
