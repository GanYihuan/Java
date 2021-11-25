package com.qiuzhi79Factory;

/**
 * BMW 工厂
 */
public interface BMWFactory {
  BMW productBWM();
}

/**
 * 实现 BMW3 生产工厂
 */
class BMW3Factory implements BMWFactory {
  @Override
  public BMW productBWM() {
    // TODO Auto-generated method stub
    System.out.println("create BMW3");
    return new BMW3();
  }
}

/**
 * 实现 BMW5 生产工厂
 */
class BMW5Factory implements BMWFactory {
  @Override
  public BMW productBWM() {
    // TODO Auto-generated method stub
    System.out.println("create BMW5");
    return new BMW5();
  }
}
