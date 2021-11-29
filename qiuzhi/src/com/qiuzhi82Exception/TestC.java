package com.qiuzhi82Exception;

public class TestC {
  public static void main(String[] args) {
    int i = 0;
    // java.lang.ArithmeticException
    // 数学计算错误
    try {
      System.out.println("1");
      System.out.println(3/i);
      System.out.println("2");
    } catch(Exception e) {
      System.out.println("3");
      System.out.println(e.getMessage());
    } finally {
      // finally 一定执行的代码
      System.out.println("finish");
    }
    System.out.println("ok");
  }
}
