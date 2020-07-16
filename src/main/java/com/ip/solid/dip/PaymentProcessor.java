package com.ip.solid.dip;

import com.ip.solid.dip.notifications.EmployeeNotifier;

import java.util.List;

/**
 * This is a payment process class for all employees.
 */
public class PaymentProcessor {

    private final transient EmployeeRepository employeeRepository;
    private final transient EmployeeNotifier employeeNotifier;

    public PaymentProcessor(EmployeeRepository employeeRepository, EmployeeNotifier employeeNotifier) {
        this.employeeRepository = employeeRepository;
        this.employeeNotifier = employeeNotifier;
    }

    public int sendPayments() {
        List<Employee> employees = this.employeeRepository.findAll();
        int totalPayments = 0;

        for (Employee employee : employees) {
            totalPayments += employee.getMonthlyIncome();
            this.employeeNotifier.notify(employee);
        }
        return totalPayments;
    }
}
