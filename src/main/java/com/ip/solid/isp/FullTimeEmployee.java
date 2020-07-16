package com.ip.solid.isp;


/**
 * This is employee class is fulltime.
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }
}
