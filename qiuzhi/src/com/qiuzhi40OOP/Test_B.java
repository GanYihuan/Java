package com.qiuzhi40OOP;

public class Test_B {
  static int t; // static 方法里, 成员变量需要 static 修饰

  public static void main(String[] args) {
    Person p = new Person(); // 类的实例化

    p.name = "zhangsha";
    System.out.println(Person.sex); // static 对象调用
    p.showName("lisi");
    p.age = 11;
    t = p.getAge();
    System.err.println(t);
  }
}
