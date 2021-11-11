package com.qiuzhi46Variableparams;

public class Test_01 {
  public static void main(String[] args) {
    Test_01 t1 = new Test_01();
    t1.printInfo("1", "xxx", "sex");
  }

  public void printInfo(String... args) {
    for(int i = 0; i < args.length; i ++) {
      System.err.println(args[i]);
    }
  }

  // 可变参数放最后, 可传递0-多个参数
  public void add(double d, int... i) {
  }
}
