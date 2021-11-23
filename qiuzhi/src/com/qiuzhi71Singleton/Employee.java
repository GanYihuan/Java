package com.qiuzhi71Singleton;

public abstract class Employee {
  public Employee() {}

  int id;
  String name;
  double salary;

  public abstract void work();
}

class CommonEmployee extends Employee {
  public void setCommonEmployeeInfo(String name, int id, double salary) {
    super.name = name;
    super.id = id;
    super.salary = salary;
  }

  public void getCommonEmployeeInfo() {
    System.out.println(super.id);
    System.out.println(super.name);
    System.out.println(super.salary);
  }

  @Override
  public void work() {
    // TODO Auto-generated method stub
    System.out.println("CommonEmployee work");
  }
}

class Manager extends Employee {
  double bonus;

  public void setManagerInfo(String name, int id, double salary, double bonus) {
    super.name = name;
    super.id = id;
    super.salary = salary;
    this.bonus = bonus;
  }

  @Override
  public void work() {
    // TODO Auto-generated method stub
    System.out.println("Manager work");
  }
}