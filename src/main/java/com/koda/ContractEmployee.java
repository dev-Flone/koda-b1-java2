package com.koda;

public class ContractEmployee extends Employee {
    private int maxSalaryIncrease = 500000;

    public ContractEmployee(String employeeId, String name, String position, String Department, int salary) {
        super(employeeId, name, position, Department, salary);
    }

    @Override
    public void increaseSalary(int amount) {
        if (amount <= 0) {
            System.out.println("Salary increase: Rp. " + amount);
            throw new IllegalArgumentException("Kenaikan gaji harus lebih dari 0");
        }
        if (amount > maxSalaryIncrease) {
            System.out.println("Salary increase: Rp. " + amount);
            throw new IllegalArgumentException("Kenaikan gaji maksimal Rp. " + maxSalaryIncrease);
        }

        addSalary(amount);

        System.out.println("Salary increase: Rp." + amount);

    }
}
