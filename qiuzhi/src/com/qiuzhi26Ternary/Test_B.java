package com.qiuzhi26Ternary;

public class Test_B {
    public static void main(String[] args) {
        // 三目运算符
        int m = 1;
        int n = 2;
        System.out.println(m > n ? m : n);

        int k = 0;
        System.out.println(k > (m > n ? m : n) ? k : (m > n ? m : n));
    }
}
