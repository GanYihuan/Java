package com.qiuzhi60super;

public class Mankind {
  int sex;

  // 当现实显示构造方法时, 类就没有默认的无参构造了
  public Mankind(int sex) {
    this.sex = sex;
    System.out.println("mankind");
  }

  public void manorwomen() {
    if (this.sex == 1) {
      System.out.println("men");
    } else {
      System.out.println("women");
    }
  }

  public void employeed() {
    System.out.println("mankind employeed");
  }
}
