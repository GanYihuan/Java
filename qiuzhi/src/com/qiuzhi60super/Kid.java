package com.qiuzhi60super;

public class Kid extends Mankind {
  // 父类只有有参构造时, 子类必须显示构建一个构造来调用父类有参构造, 切第一行
  public Kid(int sex) {
    super(sex);
  }
}
