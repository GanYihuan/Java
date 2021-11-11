package com.company;

public class Person {
  private int age;

  public void printAge() {
    System.out.println("age: " + age);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int a) {
    if (a <= 200 && a >= 0) {
      age = a;
    } else {
      System.out.println("age: " + a + " age not in 0-200");
    }
  }
}
