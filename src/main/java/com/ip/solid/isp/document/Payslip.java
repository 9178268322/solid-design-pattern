package com.ip.solid.isp.document;

import com.ip.solid.isp.Employee;

import java.time.Month;

/**
 * This payslip will generate in text format.
 */
public class Payslip implements ExportableText {

    private static final int SIZE = 21;

    private final transient String employeeName;
    private final transient int monthlyIncome;
    private final transient Month month;

    public Payslip(Employee employee, Month month) {
        this.employeeName = employee.getFullName();
        this.monthlyIncome = employee.getMonthlyIncome();
        this.month = month;
    }

    public Month getMonth() {
        return month;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toTxt() {
        StringBuilder sb = new StringBuilder(SIZE);
        sb.append("MONTH: ").append(this.month)
        .append(System.lineSeparator())
        .append("NAME: ").append(this.employeeName)
        .append(System.lineSeparator())
        .append("INCOME: ").append(this.monthlyIncome)
        .append(System.lineSeparator());

        return sb.toString();
    }
}
