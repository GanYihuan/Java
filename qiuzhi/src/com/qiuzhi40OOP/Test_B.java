package com.qiuzhi40OOP;

public class Test_B {
  // 设计类的属性, 方法
  // 类的实例化 new 创建对象
  // 对象.属性 , 对象. 方法执行
  static int t = 0;

  public static void main(String[] args) {
    Person p = new Person();
    // p.age = 28;
    p.showName("lisi");
    p.getAge();
    System.err.println(t); // static 方法里只能访问 static 成员变量
  }
}
