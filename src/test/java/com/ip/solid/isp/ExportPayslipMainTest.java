package com.ip.solid.isp;

import com.ip.solid.isp.document.Payslip;
import org.testng.annotations.Test;

import java.time.Month;
import java.util.List;
import java.util.Locale;

/**
 * This test class is used to test the
 * interface segregation principle.
 */
public class ExportPayslipMainTest {

    @Test
    public void testExportPayslip() {
        // Create dependencies
        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);

        // Grab employees
        List<Employee> employees = repository.findAll();

        Payslip payslip;

        for (Employee employee : employees) {
            payslip = new Payslip(employee , Month.AUGUST);

            String exportableText = payslip.toTxt().toUpperCase(Locale.ENGLISH);
            consoleLogger.writeInfo(exportableText);
        }
    }
}
