package com.qiuzhi50constructionmethod;

public class Person {
  int age = 0;
  String name = "";

  public Person(int a, String n) {
    age = a;
    name = n;
  }

  // 构造器重载
  public Person(int a) {
  }

  public Person(String n) {
  }

  public void showInfo() {
    System.out.println(name + age);
  }
}
