package com.qiuzhi40OOP;

/**
 * people
 */
public class Person {
  {
    int a = 0; // (代码块, 局部变量)
  }
  // public: 共用, private: 本类调用
  public String name; // String 默认值 null, 实例变量
  private int age; // int 默认值 0, 实例变量
  public static String sex = "man"; // static: 能用 Person.sex 调用 (类变量)

  public void showName(String name) { // String & name: 形参
    int i = 0; // (方法局部变量)
    System.err.println("Name: " + name + ". " + i);
  }

  public int getAge() {
    return age;
  }
}
