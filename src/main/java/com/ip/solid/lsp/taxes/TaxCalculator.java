package com.ip.solid.lsp.taxes;

import com.ip.solid.lsp.Employee;

/**
 * This is tax calculator interface.
 */
public interface TaxCalculator {

    double calculate(Employee employee);
}
