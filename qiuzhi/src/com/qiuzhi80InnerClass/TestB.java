package com.qiuzhi80InnerClass;

/**
 * 多重继承
 */
public class TestB {
  public static void main(String[] args) {
    A a = new A();
    a.testB();
    a.testC();
  }
}

/**
 * 让A同时获得B,C的方法, 并且重写
 *
 */
class A {
  public void testB() {
    new InnerB().testB();
  }

  public void testC() {
    new InnerC().testC();
  }

  private class InnerB extends B{
    public void testB() {
      System.out.println("reload testB()");
    }
  }

  private class InnerC extends C {
    public void testC() {
      System.out.println("reload testC()");
    }
  }
}

class B {
  public void testB() {}
}

class C {
  public void testC() {}
}
