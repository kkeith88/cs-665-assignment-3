/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: FrequentEmail.java
 * Description: Class for creating frequent email objects
 */

package edu.bu.met.cs665;

public class FrequentEmail implements Email{
    
    /**
     * Generates a frequent customer email template
     * @return the frequent customer email string
     */
    @Override
    public String generateEmail() {
        return "Dear Valued Frequent Customer,\nThank you for being a loyal customer.\n"
             + "Sincerely,\nThe Company Team";
    }
}
