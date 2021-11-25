package com.qiuzhi79Factory;

public class Test2 {
  public static void main(String[] args) {
    BMW b3 = new BMW3Factory().productBWM();
    b3.showInfo();

    BMW b5 = new BMW5Factory().productBWM();
    b5.showInfo();
  }
}
