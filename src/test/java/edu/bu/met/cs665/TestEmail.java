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
        Email email = EmailFactory.createEmail(CustomerType.BUSINESS);
        assertNotNull(email);
        assertEquals(true, email.generateEmail().contains("Dear Valued Business Partner"));
    }

    @Test
    public void testCreateReturningEmail() {
        Email email = EmailFactory.createEmail(CustomerType.RETURNING);
        assertNotNull(email);
        assertEquals(true, email.generateEmail().contains("Welcome Back"));
    }

    @Test
    public void testCreateNewCustomerEmail() {
        Email email = EmailFactory.createEmail(CustomerType.NEW);
        assertNotNull(email);
        assertEquals(true, email.generateEmail().contains("Dear New Customer"));
    }

    @Test
    public void testCreateFrequentEmail() {
        Email email = EmailFactory.createEmail(CustomerType.FREQUENT);
        assertNotNull(email);
        assertEquals(true, email.generateEmail().contains("Dear Valued Frequent Customer"));
    }

    @Test
    public void testCreateVipEmail() {
        Email email = EmailFactory.createEmail(CustomerType.VIP);
        assertNotNull(email);
        assertEquals(true, email.generateEmail().contains("Dear Esteemed VIP Customer"));
    }
}