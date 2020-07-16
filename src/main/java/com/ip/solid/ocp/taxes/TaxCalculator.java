package com.ip.solid.ocp.taxes;

import com.ip.solid.ocp.Employee;

/**
 * This is tax calculator interface.
 */
public interface TaxCalculator {

    double calculate(Employee employee);
}
