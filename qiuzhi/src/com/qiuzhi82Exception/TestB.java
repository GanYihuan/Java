package com.qiuzhi82Exception;

public class TestB {
  public static void main(String[] args) {
    // A a = new A();
    A a = null;
    // a 没有指向任何对象, 指向的是 null, 没有i的值
    // java.lang.NullPointerException
    System.out.println(a.i);
  }
}

class A {
  int i;
}
