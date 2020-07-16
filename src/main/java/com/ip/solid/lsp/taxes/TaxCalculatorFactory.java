package com.ip.solid.lsp.taxes;

import com.ip.solid.lsp.Employee;
import com.ip.solid.lsp.FullTimeEmployee;
import com.ip.solid.lsp.Intern;
import com.ip.solid.lsp.PartTimeEmployee;

/**
 * This is a factory class for types of employees.
 */
public final class TaxCalculatorFactory {

    private TaxCalculatorFactory() {

    }

    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeTaxCalculator();
        }

        if (employee instanceof PartTimeEmployee) {
            return new PartTimeTaxCalculator();
        }

        if (employee instanceof Intern) {
            return new InternTaxCalculator();
        }

        throw new IllegalArgumentException("Invalid employee type");
    }
}
