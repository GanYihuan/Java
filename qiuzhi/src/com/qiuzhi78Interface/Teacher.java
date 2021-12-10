package com.qiuzhi78Interface;

public class Teacher extends Person implements Cooking, Sing {
  String course;

  public void setInfo() {
    super.age = 28;
    super.name = "ganyihuan";
    super.sex = 1;
    this.course = "math";
  }

  @Override
  public void showInfo() {
    // TODO Auto-generated method stub
    System.out.println(super.age);
    System.out.println(super.name);
    System.out.println(super.sex);
  }

  @Override
  public void singing() {
    // TODO Auto-generated method stub
    System.out.println(super.name + "Teacher sing");
  }

  @Override
  public void fly() {
    // TODO Auto-generated method stub
    System.out.println(super.name + "Teacher fly");
  }
}
