package com.training.org;

public class Zorganization {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.showEmployeeDetails();
        Employee e2=new Employee(210,"ajit",50000);
        e2.showEmployeeDetails();
        e2.incrementSalary();
    }
}
