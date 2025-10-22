/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: BusinessEmail.java
 * Description: Class for creating business email objects
 */

package edu.bu.met.cs665;

public class BusinessEmail implements Email {
    
    /**
     * Generates a business email template
     * @return the business email string
     */
    @Override
    public String generateEmail() {
        return "Dear Valued Business Partner,\nWe appreciate your continued collaboration.\n"
             + "Sincerely,\nThe Company Team";
    }
}

