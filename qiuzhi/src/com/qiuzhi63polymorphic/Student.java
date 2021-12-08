package com.qiuzhi63polymorphic;

public class Student extends Person{
  String school;

  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();
    Person e = new Student(); // 向上转型: 父类引用指向子类对象, Person 类型变量 e, 指向 Student 类型对象

    s.school = "1";
    // e.school = "2"; // 父类引用 e 不能访问子类 Student 属性和方法, e 向上转型为 Person 所以没有

    p.showInfo(); // person showInfo
    s.showInfo(); // student showInfo
    e.showInfo(); // student showInfo;
  }

  public void showInfo() {
    System.out.println("student showInfo");
  }

  // 多态:
  // 1: 继承: extends
  // 2: 重写: showInfo
  // 3: 向上转型, 父类引用指向子类对象 -> Person e = new Student();
}
