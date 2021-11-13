package com.qiuzhi56extend;

public class Person {
  String name;
  int sex;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSex() {
    return sex;
  }

  public void setSex(int sex) {
    this.sex = sex;
  }

  public void maleorfemal() {
    if(this.sex == 0) {
      System.out.println("female");
    } else {
      System.out.println("male");
    }
  }
}
