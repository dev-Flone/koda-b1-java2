package com.koda;

public abstract class Employee {
    private String employeeId;
    private String name;
    private String position;
    private String department;
    private int salary;

    public Employee(String employeeId, String name, String position, String department, int salary) {
        if (salary < 0) {
            System.out.println("Gaji tidak boleh negatif");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public void employeeData() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Position: " + getEmployeePosition());
        System.out.println("Department: " + getEmployeeDepartment());
        System.out.println("Salary: Rp." + getEmployeeSalary());
    }

    protected void addSalary(int amount) {
        if (amount <= 0) {
            System.out.println("Gaji harus lebih dari 0");
        }
        salary += amount;
    }

    public abstract void increaseSalary(int amount);

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getEmployeePosition() {
        return position;
    }

    public String getEmployeeDepartment() {
        return department;
    }

    public int getEmployeeSalary() {
        return salary;
    }

}
