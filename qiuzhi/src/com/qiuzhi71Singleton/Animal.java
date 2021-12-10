package com.qiuzhi71Singleton;

/**
 * 父类设计得抽象没有实例
 */
public abstract class Animal {
  public abstract void test(); // 只要有一个抽象方法, 类必须是抽象类
  public abstract void move();
}

/**
 * 子类设计得具体
 */
class Dog extends Animal {
  @Override
  public void test() {}

  @Override
  public void move() {
    System.out.println("Dog run");
  }
}

abstract class Fish extends Animal {
  @Override
  public void test() {}

  @Override
  public abstract void move();
}
