package com.qiuzhi56extend;

public class Student extends Person {
  String school;

  public void showInfo() {
    System.out.println(this.school);
  }

  public static void main(String[] args) {
    Student s = new Student();
    s.setSex(1);
    s.setName("Ganyihuan");
    s.maleorfemal();
    s.showInfo();
    System.out.println(s.getName());
  }
}
