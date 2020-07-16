package com.ip.solid.dip;

import java.io.IOException;
import java.util.List;

/**
 * This is an employee repo.
 */
public interface EmployeeRepository {

    List<Employee> findAll();
    void save(Employee employee) throws IOException;
}
