package com.qiuzhi45Overloard;

public class Test_01 {
  public static void main(String[] args) {
    // 方法重载(看传入的参数, 个数, 顺序, 类型不同), 方法名一样
    Test_01 t1 = new Test_01();
    t1.add(1, 2);
    t1.add(1, 1.5);
    t1.add(1, 2, 3);
  }

  public int add(int x, int y) {
    return x + y;
  }

  public double add(int x, double y) {
    return x + y;
  }

  public int add(int x, int y, int z) {
    return x + y + z;
  }
}
