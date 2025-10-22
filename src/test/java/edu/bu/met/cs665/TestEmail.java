/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: TestEmail.java
 * Description: Class for testing email creation
 */

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class TestEmail {
    
    public TestEmail() {
        //Empty Constructor
    }

    /**
     * Test Creating a Business Email.
     * Test that the response is not null and contains expected text.
     */
    @Test
    public void testCreateBusinessEmail() {
        String testString = "Dear Valued Business Partner,\nWe appreciate your continued collaboration.\n"
                + "Sincerely,\nThe Company Team";
        Email email = EmailFactory.createEmail(CustomerType.BUSINESS);
        assertNotNull(email);
        assertEquals(testString, email.generateEmail());
    }

    /**
     * Test Creating a Returning Email.
     * Test that the response is not null and contains expected text.
     */
    @Test
    public void testCreateReturningEmail() {
        String testString = "Welcome Back,\nWe appreciate your continued support.\n"
                + "Sincerely,\nThe Company Team";
        Email email = EmailFactory.createEmail(CustomerType.RETURNING);
        assertNotNull(email);
        assertEquals(testString, email.generateEmail());
    }

    /**
     * Test Creating a New Customer Email.
     * Test that the response is not null and contains expected text.
     */
    @Test
    public void testCreateNewCustomerEmail() {
        String testString = "Dear New Customer,\nWelcome to our community! We're excited to have you with us.\n"
                + "Sincerely,\nThe Company Team";
        Email email = EmailFactory.createEmail(CustomerType.NEW);
        assertNotNull(email);
        assertEquals(testString, email.generateEmail());
    }

    /**
     * Test Creating a Frequent Email.
     * Test that the response is not null and contains expected text.
     */
    @Test
    public void testCreateFrequentEmail() {
        String testString = "Dear Valued Frequent Customer,\nThank you for being a loyal customer.\n"
             + "Sincerely,\nThe Company Team";
        Email email = EmailFactory.createEmail(CustomerType.FREQUENT);
        assertNotNull(email);
        assertEquals(testString, email.generateEmail());
    }

    /**
     * Test Creating a VIP Email.
     * Test that the response is not null and contains expected text.
     */
    @Test
    public void testCreateVipEmail() {
        String testString = "Dear Esteemed VIP Customer,\nThank you for your continued loyalty and "
                + "being a part of our VIP program.\n"
                + "We value your business greatly.\nBest regards,\nThe VIP Team";
        Email email = EmailFactory.createEmail(CustomerType.VIP);
        assertNotNull(email);
        assertEquals(testString, email.generateEmail());
    }
}