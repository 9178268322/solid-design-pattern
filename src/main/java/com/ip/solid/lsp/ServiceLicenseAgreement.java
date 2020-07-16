package com.ip.solid.lsp;

/**
 * This agreement class is for sub contractor.
 */
public class ServiceLicenseAgreement {

    private final transient int minUptimePercent;
    private final transient int problemResolutionTimeDays;

    public ServiceLicenseAgreement(int minUptime, int problemResolutionTimeDays) {
        this.minUptimePercent = minUptime;
        this.problemResolutionTimeDays = problemResolutionTimeDays;
    }

    public int getMinUptimePercent() {
        return minUptimePercent;
    }

    public int getProblemResolutionTimeDays() {
        return problemResolutionTimeDays;
    }
}
