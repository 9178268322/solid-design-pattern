package com.ip.solid.srp;

/**
 * This employee class is for intern.
 */
public class Intern extends Employee {

    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }
}
