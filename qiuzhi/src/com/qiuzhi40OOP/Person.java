package com.qiuzhi40OOP;

public class Person {
  public String name;
  public int age;
  public static String sex = "man";

  public void showName(String name) {
    System.err.println("Name: " + name);
  }

  public int getAge() {
    return age;
  }
}
