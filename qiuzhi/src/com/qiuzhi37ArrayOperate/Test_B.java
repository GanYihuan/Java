package com.qiuzhi37ArrayOperate;

public class Test_B {
  public static void main(String[] args) {
    // java.lang.ArrayIndexOutOfBoundsException
    // 访问了不存在的数组脚标时发生
    // int[] arr = new int[3];
    // System.err.println(arr[4]);

    // java.lang.NullPointerException
    // arr 引用没有指向实体, 却在操作实体元素
    int[] arr2 = null;
    System.err.println(arr2[0]);
  }
}
