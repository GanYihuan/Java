package com.qiuzhi79Factory;

/**
 * BMW 产品接口
 */
public interface BMW {
  void showInfo();
}

/**
 * BMW3 具体子类
 */
class BMW3 implements BMW {
  @Override
  public void showInfo() {
    // TODO Auto-generated method stub
    System.out.println("BMW3");
  }
}

/**
 * BMW5 具体子类
 */
class BMW5 implements BMW {
  @Override
  public void showInfo() {
    // TODO Auto-generated method stub
    System.out.println("BMW5");
  }
}
