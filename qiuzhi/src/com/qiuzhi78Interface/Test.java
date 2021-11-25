package com.qiuzhi78Interface;

public class Test {
  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    t1.setInfo();
    t1.showInfo();
    t1.fly();
    t1.singing();

    Cooking c = new Teacher();
    c.fly();

    Sing s = new Teacher();
    s.singing();
  }
}
