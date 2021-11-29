package com.qiuzhi82Exception;

public class TestA {
  public static void main(String[] args) {
    String[] str = new String[]{"a", "b", "c"};
    // java.lang.ArrayIndexOutOfBoundsException
    // 数组没有第四个元素, 无法输出str[3]
    for(int i = 0; i < 4; i ++) {
      System.out.println(str[i]);
    }
  }
}
