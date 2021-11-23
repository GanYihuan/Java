package com.qiuzhi71Singleton;

/**
 * 饿汉式单例模式
 */
public class Single {
  private Single() {}
  private static Single single = new Single();

  public static Single getInstance() {
    return single;
  }
}
