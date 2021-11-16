package com.qiuzhi63polymorphic;

public class Student extends Person{
  String school;

  public static void main(String[] args) {
    Person p = new Person();
    // 向上转型: 父类对象的引用指向子类对象
    Person e = new Student(); // Person 类型变量e, 指向 Student 类型对象
    Student s = new Student();

    s.school = "1";
    // e.school = "2"; // e 不能访问子类 Student 属性和方法, e 向上转型为 Person 所以没有

    s.showInfo(); // student showInfo
    p.showInfo(); // person showInfo
    e.showInfo(); // student showInfo; 编译时e是person类型, 方法调用是运行时确定, 调用的是 student showinfo()
  }

  public void showInfo() {
    System.out.println("student showInfo");
  }

  // 多态:
  // 1: 继承
  // 2: 重写
  // 3: 变量不具备多态性
  // 4: 运行时调用重写方法
}
