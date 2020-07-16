package com.ip.solid.srp;

/**
 * This is the serializer class.
 */
public class EmployeeFileSerializer {

    private static final int SIZE = 61;

    public String serialize(Employee employee) {
        StringBuilder sb = new StringBuilder(SIZE);

        sb.append("### EMPLOYEE RECORD ####")
        .append(System.lineSeparator())
        .append("NAME: ")
        .append(employee.getFullName())
        .append(System.lineSeparator())
        .append("POSITION: ")
        .append(employee.getClass().getTypeName())
        .append(System.lineSeparator())
        .append("EMAIL: ")
        .append(employee.getEmail())
        .append(System.lineSeparator())
        .append("MONTHLY WAGE: ")
        .append(employee.getMonthlyIncome())
        .append(System.lineSeparator());

        return sb.toString();
    }
}
