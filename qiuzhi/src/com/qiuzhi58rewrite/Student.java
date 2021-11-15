package com.qiuzhi58rewrite;

public class Student extends Person {
  // 子类重写父类方法, 只是重写方法体代码
  // 父类public, 子类不能使用缺省以下
  public void showInfo() {
    System.out.println("Student showInfo");
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.showInfo();
  }
}
