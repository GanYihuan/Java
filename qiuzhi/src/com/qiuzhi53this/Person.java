package com.qiuzhi53this;

public class Person {
  int age;
  String name;

  public Person() {
    // this("ganyihuan"); 自己不能调用自己, 变相也不行
  }

  public Person(int age) {
    this(); // 调用 public Person(){}, this(); 必须放置方法首行
    this.age = age;
  }

  public Person(String name) {
    this(1); // 调用 public Person(int age) {}
    this.name = name;
  }

  public Person(int age, String name) {
    this.age = age; // this.age 等于外部 int age;
    this.name = name; // this.name 等于外部 String name
  }

  public void setName(String name) {
    this.name = name;
  }

  public void changeName(String name) {
    this.setName(name); // 调用 setName()
  }

  public void showInfo() {
    System.out.println("name: " + this.name + ", age: " + this.age);
  }
}
