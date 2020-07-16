package com.ip.solid.dip.notifications;

import com.ip.solid.dip.Employee;

/**
 * This is an email notifier for all employees.
 */
public interface EmployeeNotifier {
    void notify(Employee employee);
}
