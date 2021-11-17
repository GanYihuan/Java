package com.qiuzhi68instanceof;

public class Test extends Person{
  public static void main(String[] args) {
    Test t = new Test();
    Person a = new Person();
    System.out.println(a instanceof Person);
    System.out.println(t instanceof Test);
    t.showInfo(a);
  }

  public void showInfo(Person a) {
    // instanceof: a 是否是 Person 的对象, 是返回 true
    if(a instanceof Person) {
      System.out.println("^^^");
    } else {
      System.out.println("xxx");
    }
  }
}
