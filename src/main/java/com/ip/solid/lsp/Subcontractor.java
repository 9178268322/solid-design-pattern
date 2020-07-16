package com.ip.solid.lsp;

/**
 * This is sub contractor not an employee.
 */
public class Subcontractor {

    final transient int monthlyIncome;
    final transient int nbHoursPerWeek;
    final transient String email;
    final transient String name;

    private static final int MIN_UP_TIME_PERCENT = 98;
    private static final int PRBLM_RESOLUCTION_TIME = 2;

    public Subcontractor(String name, String email, int monthlyIncome, int nbHoursPerWeek) {
        this.name = name;
        this.email = email;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public boolean approveSLA(ServiceLicenseAgreement sla) {
        boolean result = false;
        if (sla.getMinUptimePercent() >= MIN_UP_TIME_PERCENT &&
                sla.getProblemResolutionTimeDays() <= PRBLM_RESOLUCTION_TIME) {
            result = true;
        }

        System.out.println("SLA approval for " + this.name + ": " + result);
        return result;
    }
}
