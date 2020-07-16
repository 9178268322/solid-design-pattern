package com.ip.solid.ocp.taxes;

import com.ip.solid.ocp.Employee;
import com.ip.solid.ocp.FullTimeEmployee;
import com.ip.solid.ocp.Intern;
import com.ip.solid.ocp.PartTimeEmployee;

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
