package com.ip.solid.dip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Helper method to perform CRUD operations on employees. In a production
 * application we could use the database for persistence. In this demo,
 * we are storing employees in the file system.
 */
public class EmployeeFileRepository implements EmployeeRepository {

    private static final int[] NB_HOURS = {40, 20};

    private final transient EmployeeFileSerializer serializer;

    public EmployeeFileRepository(EmployeeFileSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        String path = Thread.currentThread().getContextClassLoader().getResource("employees.csv").getPath();

        try {
            Scanner scanner = new Scanner(new File(path));
            // skip header
            scanner.nextLine();

            // Process content
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Employee employee = createEmployeeFromCsvRecord(line);
                employees.add(employee);
            }
        } catch (FileNotFoundException exception) {
            System.out.println(exception);
        }
        return employees;
    }

    @Override
    public void save(Employee employee) throws IOException {
        String serializedString = this.serializer.serialize(employee);

        Path path = Paths.get(employee.getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, serializedString.getBytes());
    }

    private Employee createEmployeeFromCsvRecord(String line) {
        String[] employeeRecord = line.split(",");
        String name = employeeRecord[0];
        int income = Integer.parseInt(employeeRecord[1]);
        int nbHours = Integer.parseInt(employeeRecord[2]);

        Employee employee;
        if (nbHours == NB_HOURS[0]) {
            employee = new FullTimeEmployee(name, income);
        } else if (nbHours == NB_HOURS[1]) {
            employee = new PartTimeEmployee(name, income);
        } else {
            employee = new Intern(name, income, nbHours);
        }
        return employee;
    }
}
