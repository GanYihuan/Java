package com.qiuzhi60super;

public class KK extends Mankind{
  public KK(int sex) {
    super(sex); // 父类只有有参构造时, 子类必须显示构建一个构造来调用父类有参构造, 且是第一行
  }

  public void test() {
    super.sex = 1;
    super.manorwomen();
  }

  public void employeed() { // 重写父类 employeed()
    super.employeed(); // 调用父类employeed()
    System.out.println("kk employeed");
  }

  public static void main(String[] args) {
    KK k = new KK(1);
    k.employeed();
  }
  /*
  this: 访问本类中属性(方法), 如果无该属性则从父类中查找
  super: 访问父类属性(方法)

  this(): 调用本类构造器, 必须放置首行
  super(): 调用父类构造器, 放置子类构造器首行

  this: 表示当前对象
  */
}
