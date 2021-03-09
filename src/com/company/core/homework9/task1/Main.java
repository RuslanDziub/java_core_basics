package com.company.core.homework9.task1;

import com.company.core.homework9.task1.salary.Employee;
import com.company.core.homework9.task1.salary.FinService;
import com.company.core.homework9.task1.salary.FixedSalaryEmployee;
import com.company.core.homework9.task1.salary.HourlySalaryEmployee;

public class Main {
    public static void main(String[] args) {
        FixedSalaryEmployee employee1 = new FixedSalaryEmployee(23413);
        FixedSalaryEmployee employee2 = new FixedSalaryEmployee(32523);
        FixedSalaryEmployee employee3 = new FixedSalaryEmployee(54632);
        HourlySalaryEmployee employee4 = new HourlySalaryEmployee(190);
        employee4.setWorkedHours(23);
        HourlySalaryEmployee employee5 = new HourlySalaryEmployee(30);
        employee5.setWorkedHours(34);
        HourlySalaryEmployee employee6 = new HourlySalaryEmployee(100);
        employee6.setWorkedHours(100);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5, employee6};

        for (Employee employee : employees) {
            FinService.pay(employee);
        }
    }
}
