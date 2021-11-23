package com.qiuzhi72Main;

/**
 * 传递参数 123, abc
 * 运行方法:
 * cmd -> javac Test.java
 * java Test 123 abc
 */
public class Test {
  /**
   * 接受一个String类型的数组参数, 数组中保存执行java命令时传递类的参数
   * @param args
   */
  public static void main(String[] args) {
    for(int i = 0; i < args.length; i ++) {
      System.out.println(args[i]);
    }
  }
}
