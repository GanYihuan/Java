package com.qiuzhi76Template;

import javax.xml.transform.SourceLocator;

/**
 * 模板设计模式
 * 抽象类作为模板, 子类在抽象类基础上扩展
 */
public abstract class Template {
  public abstract void code();

  public final void getTime() {
    long start = System.currentTimeMillis();
    code();
    long end = System.currentTimeMillis();

    System.out.println("code() run time: " + (end - start));
  }
}

class TestTmp extends Template {

  @Override
  public void code() {
    // TODO Auto-generated method stub
    int k = 0;
    for(int i = 0; i < 50000; i ++) {
      k += 1;
    }
    System.out.println(k);
  }
}