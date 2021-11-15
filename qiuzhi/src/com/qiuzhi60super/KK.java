package com.qiuzhi60super;

public class KK extends Kid{
  // 父类只有有参构造时, 子类必须显示构建一个构造来调用父类有参构造, 切第一行
  public KK(int sex) {
    super(sex);
  }

  public void test() {
    super.sex = 1;
    super.manorwomen();
  }

  // 重写父类 employeed()
  public void employeed() {
    super.employeed(); // 调用父类employeed()
    System.out.println("kk employeed");
  }

  public static void main(String[] args) {
    KK k = new KK(1);
    k.employeed();
  }
}
