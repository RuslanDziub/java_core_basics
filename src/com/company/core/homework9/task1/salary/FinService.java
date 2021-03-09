package com.company.core.homework9.task1.salary;

public class FinService {
    public static void pay(Employee employee) {
        System.out.println("This employee got " + employee.calculateSalary() + " this month.");
    }
}
