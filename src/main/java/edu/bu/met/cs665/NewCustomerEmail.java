/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: NewCustomerEmail.java
 * Description: Class for creating new customer email objects
 */

package edu.bu.met.cs665;

public class NewCustomerEmail implements Email {

    /**
     * Generates a new customer email template
     * @return the new customer email string
     */
    @Override
    public String generateEmail() {
        return "Dear New Customer,\nWelcome to our community! We're excited to have you with us.\n"
             + "Sincerely,\nThe Company Team";
    }
    
}
