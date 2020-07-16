package com.ip.solid.dip.notifications;

import com.ip.solid.dip.Employee;

/**
 * This is an email sender for all employees.
 */
public class EmailSender implements EmployeeNotifier {

    @Override
    public void notify(Employee employee) {
        System.out.println("Notified: " + employee.getEmail());
    }
}
