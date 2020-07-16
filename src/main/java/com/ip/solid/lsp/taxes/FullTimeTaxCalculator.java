package com.ip.solid.lsp.taxes;

import com.ip.solid.lsp.Employee;

/**
 * This calculator is for full time
 * employees.
 */
public class FullTimeTaxCalculator implements TaxCalculator {

    private static final int RETIREMENT_TAX_PERCENTAGE = 10;
    private static final int INCOME_TAX_PERCENTAGE = 16;
    private static final int BASE_HEALTH_INSURANCE = 100;

    @Override
    public double calculate(Employee employee) {
        return BASE_HEALTH_INSURANCE +
                (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
    }
}
