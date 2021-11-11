package com.qiuzhi33NestLoop;

public class Test_B {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i ++) {
            if (i % 2 == 0) {
                continue; // 结束当前循环, 下面代码不执行, 直接进入下一次
            }
            System.out.println(i);
        }
    }
}
