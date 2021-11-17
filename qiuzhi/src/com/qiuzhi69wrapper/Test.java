package com.qiuzhi69wrapper;

import java.util.Date;

public class Test {
  public static void main(String[] args) {
    Integer i = new Integer(1);
    System.out.println(i);

    Integer i2 = new Integer(2); // 包装类
    int l2 = i2.intValue(); // 拆箱
    System.out.println(l2);

    Integer i3 = 3; // 自动装箱
    int l3 = i3;
    System.out.println(l3);

    /**
     * 字符串转换为基本数据类型
     */
    int i4 = Integer.parseInt("4");
    System.out.println(i4);
    float f4 = Float.parseFloat("0.4");
    System.out.println(f4);
    Boolean b4 = Boolean.parseBoolean("true");
    System.out.println(b4);

    /**
     * 基本数据类型转换为字符串
     */
    String istr5 = String.valueOf(5);
    System.out.println(istr5);
  }
}
