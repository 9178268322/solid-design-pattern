package com.ip.solid.lsp.taxes;

import com.ip.solid.lsp.Employee;

/**
 * This calculator is for intern employee.
 */
public class InternTaxCalculator implements TaxCalculator {

    private static final int INCOME_TAX_PERCENTAGE = 16;
    private static final int MONTHLY_INCOME = 350;

    @Override
    public double calculate(Employee employee) {
        int monthlyIncome = employee.getMonthlyIncome();
        if (monthlyIncome < MONTHLY_INCOME) {
            return 0;
        } else {
            return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
        }
    }
}
