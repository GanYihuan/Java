package com.qiuzhi71Singleton;

public class TestC {
  public static void main(String[] args) {
    CommonEmployee ce = new CommonEmployee();
    ce.work();
    ce.setCommonEmployeeInfo("zhangshan", 1, 3800);

    Manager m = new Manager();
    m.work();
    m.setManagerInfo("lisi", 2, 5000, 3000);
  }
}
