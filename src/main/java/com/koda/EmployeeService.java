package com.koda;

public class EmployeeService {
    private Employee employeeData;

    public EmployeeService(Employee employeeData) {
        this.employeeData = employeeData;
    }

    public void showEmployee() {
        System.out.println("Employee ID: " + employeeData.getEmployeeId());
        System.out.println("Name: " + employeeData.getEmployeeName());
        System.out.println("Position: " + employeeData.getEmployeePosition());
        System.out.println("Department: " + employeeData.getEmployeeDepartment());
        System.out.println("Salary: Rp. " + employeeData.getEmployeeSalary());
        System.out.println();

    }

    public void giveRaise(int amount) {
        try {
            employeeData.increaseSalary(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Current Salary: Rp. " + employeeData.getEmployeeSalary());
    }
}
