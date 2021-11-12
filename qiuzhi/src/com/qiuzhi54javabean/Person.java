package com.qiuzhi54javabean;

/**
 * javabean
 * 私有属性
 * 属性对应 set() & get()
 */
public class Person {
  /**
   * 自动生产 get() & set() 方法
   * 右键 -> source -> generate getter and setter
   */
  private int age;

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }
}
