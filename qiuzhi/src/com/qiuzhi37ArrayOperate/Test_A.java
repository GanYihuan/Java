package com.qiuzhi37ArrayOperate;

public class Test_A {
  public static void main(String[] args) {
    int[] arr = new int[]{4, 2, 7, 1, 3, 5};
    // 最大值
    int max = arr[0];
    for(int i = 0; i < arr.length; i ++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }
    System.out.println("max: " + max);

    // 总和
    int all = 0;
    for(int i = 0; i < arr.length; i ++) {
      all += arr[i];
    }
    System.out.println("total: " + all);
    System.out.println("average: " + all / arr.length);

    // 复制
    int[] copy = new int[arr.length];
    for(int i = 0; i < arr.length; i ++) {
      copy[i] = arr[i];
    }

    // 反转
    int[] temp = new int[]{arr.length};
    int k = 0;
    for(int i = arr.length - 1; i >= 0; i --) {
      temp[k] = arr[i];
    }

    // 正序排列
    int in = 0;
    for(int i = 0; i < arr.length; i ++){
      for(int j = 0; j < arr.length - 1 - i; j ++) {
        if(arr[j] > arr[j + 1]) {
          in = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = in;
        }
      }
    }
    for(int i = 0; i < arr.length; i ++) {
      System.err.println(arr[i]);
    }
  }
}
