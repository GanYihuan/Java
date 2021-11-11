package com.qiuzhi34Array;

public class Test_B {
    public static void main(String[] args) {
      // 输出二维数组内部所有值的和
      int[][] ii0 = new int[][]{{1, 2},{3, 4}};
      int[][] ii1 = new int[1][2];

      int[][] arr = new int[][]{
        {1, 2},
        {3, 4},
        {5, 6},
        {7, 8}
      };
      int res = 0;
      for(int i = 0; i < arr.length; i ++) {
        int[] arr0 = arr[i];
        for(int j = 0; j < arr0.length; j ++) {
          res += arr0[j];
        }
      }
      System.out.println(res);
    }
}

