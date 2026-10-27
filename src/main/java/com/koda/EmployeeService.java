package com.koda;

public class EmployeeService {
    private Employee employeeData;

    public EmployeeService(Employee employeeData) {
        this.employeeData = employeeData;
    }

    public void showEmployee() {
        System.out.println("Employee ID: " + employeeData.getEmployeeId());
        System.out.println("Name: " + employeeData.getEmployeeName());
        System.out.println("Position: " + employeeData.getPosition());
        System.out.println("Department: " + employeeData.getDepartment());
        System.out.println("Salary: Rp. " + employeeData.getSalary());
        System.out.println();

    }

    public void giveRaise(int amount) {
        try {
            employeeData.increaseSalary(amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Current Salary: Rp. " + employeeData.getSalary());
    }
}
