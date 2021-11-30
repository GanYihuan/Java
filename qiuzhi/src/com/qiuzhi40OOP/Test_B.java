package com.qiuzhi40OOP;

public class Test_B {
  static int t;

  public static void main(String[] args) {
    Person p = new Person(); // 类的实例化 new 创建对象
    p.name = "zhangsha";
    System.out.println(Person.sex); // static 不需要实例化就可以使用, 直接 . 调用
    p.showName("lisi");

    p.age = 11;
    t = p.getAge();
    System.err.println(t); // static 方法里只能访问 static 成员变量
  }
}
