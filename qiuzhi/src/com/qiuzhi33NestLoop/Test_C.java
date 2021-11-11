package com.qiuzhi33NestLoop;

public class Test_C {
    public static void main(String[] args) {
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 2; j ++) {
                if(j == 1) {
                    return; // 整个循环退出, 影响到外面整个循环
                  //  break; // 终止当前作用域内循环
                }
            }
            System.out.println(i);
        }
    }
}
