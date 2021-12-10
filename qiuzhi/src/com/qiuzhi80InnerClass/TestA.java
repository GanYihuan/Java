package com.qiuzhi80InnerClass;

/**
 * 内部类解决java多重继承问题
 */
public class TestA {
  int x;
  public int y;
  public int z;

  private final class A {
    int a;

    public void setTest() {
      TestA.this.x = 1;
      TestA.this.y = 2;
      TestA.this.z = 3;
    }

    public void setA() {
      this.a = 4;
    }
  }

  static class B {}

  abstract class C {}

  class D extends C {}

  public void setInfo() {
    new A().setTest();
  }

  public void showInfo() {
    System.out.println(this.x);
    System.out.println(this.y);
    System.out.println(this.z);
  }

  public static void main(String[] args) {
    TestA t1 = new TestA();
    t1.setInfo();
    t1.showInfo();
  }
}
