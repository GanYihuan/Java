package com.qiuzhi71Singleton;

/**
 * 饿汉式单例模式
 * 只有一个实例, 类只实例化一次, 节省 new 的运算时间
 */
public class TestA {
  public static void main(String[] args) {
    Single s = Single.getInstance();
    Single s2 = Single.getInstance();
    Single s3 = Single.getInstance();
    Single s4 = Single.getInstance();
    Single s5 = Single.getInstance();
  }
}
