package com.training.org;

public class Employee {
    private int empId;
    private String name;
    private double salary;

    public Employee(){
        System.out.println("Default constructor of Employee is called");
        empId=0;
        name="";
        salary=0;
    }
    public Employee(int empId, String name, double salary) {
        System.out.println("Parameterised constructor of Employee is called");
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public void showEmployeeDetails(){
        System.out.println("Employee details are "+empId+ " Name :- "+name+" Salary :- "+salary);
    }
    public void incrementSalary()
    {
        if(salary<40000)
        {
            salary+=0.05*salary;
            System.out.println(salary);
        }
        else if(salary>=40000 && salary<50000)
        {
            salary+=0.07*salary;
            System.out.println(salary);
        }
        else if(salary>=50000 && salary<70000)
        {
            salary+=0.1*salary;
            System.out.println(salary);
        }
        else if(salary>70000)
        {
            salary+=0.15*salary;
            System.out.println(salary);
        }
    }


}
