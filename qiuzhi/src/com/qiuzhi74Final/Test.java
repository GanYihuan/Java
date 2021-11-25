package com.qiuzhi74Final;

/**
 * final 类: 不能继承
 * final 方法: 不能重写
 * final 变量: 不能修改
 */
public class Test {
  final static String SEX_1 = "man"; // final staic: 全局常量
}

/**
 * final 类: 不能继承
 */
// public class Test {
//   String name;
//   public void test() {}
// }
// class T extends Test {}

/**
 * final 方法: 不能重写
 */
// public class Test {
//   String name;
//   public final void test() {}
// }
// class T0 extends Test {
//   public void test() {
//     super.test();
//   }
// }

/**
 * final 变量: 不能修改
 */
// public class Test {
//   final String name = "";
//   name = "gan";
// }