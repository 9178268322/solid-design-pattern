package com.ip.solid.dip;

import com.ip.solid.dip.notifications.EmailSender;
import com.ip.solid.dip.notifications.EmployeeNotifier;
import org.testng.annotations.Test;

/**
 * This test class is used to test
 * payment process.
 */
public class PayEmployeesMainTest {

    @Test
    public void testPaymentProcessor() {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeRepository employeeRepository = new EmployeeFileRepository(serializer);
        EmployeeNotifier employeeNotifier = new EmailSender();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository, employeeNotifier);

        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
