package com.ip.solid.ocp.taxes;

import com.ip.solid.ocp.Employee;

/**
 * This calculator is for part time employee.
 */
public class PartTimeTaxCalculator implements TaxCalculator {

    private static final int RETIREMENT_TAX_PERCENTAGE = 5;
    private static final int INCOME_TAX_PERCENTAGE = 16;
    private static final int BASE_HEALTH_INSURANCE = 100;

    @Override
    public double calculate(Employee employee) {
        int monthlyIncome = employee.getMonthlyIncome();
        return BASE_HEALTH_INSURANCE +
                (monthlyIncome * RETIREMENT_TAX_PERCENTAGE) / 100 +
                (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
    }
}
