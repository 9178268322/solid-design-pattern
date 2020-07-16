package com.ip.solid.srp;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

/**
 * This test class is used to test the
 * single responsibility.
 */
public class SaveEmployeesMainTest {

    @Test
    public void saveEmployeeTest() {

        // Grab employees
        EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        EmployeeRepository repository = new EmployeeRepository(employeeFileSerializer);
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees) {
            try {
                repository.save(e);
                consoleLogger.writeInfo("Saved employee " + e.toString());
            } catch (IOException exception) {
                consoleLogger.writeError("Error saving employee", exception);
            }
        }
    }
}
