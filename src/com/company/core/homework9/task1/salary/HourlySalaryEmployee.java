package com.company.core.homework9.task1.salary;

public class HourlySalaryEmployee implements Employee {
    private double salary;
    private int workedHours;

    public HourlySalaryEmployee(int salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkedHours() {
        return this.workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return salary * workedHours;
    }
}
