package com.koda;

public class PermanentEmployee extends Employee {
    public PermanentEmployee(String employeeId, String name, String position, String Department, int salary) {
        super(employeeId, name, position, Department, salary);
    }

    @Override
    public void increaseSalary(int amount) {
        addSalary(amount);

        System.out.println("Salary increase: Rp. " + amount);
    }

};
