package com.company.core.homework9.task1.salary;

public class FixedSalaryEmployee implements Employee {
    private int salary;

    public FixedSalaryEmployee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
