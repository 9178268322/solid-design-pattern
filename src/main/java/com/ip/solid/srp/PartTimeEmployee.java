package com.ip.solid.srp;

/**
 * This employee class is part time.
 */
public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }
}
