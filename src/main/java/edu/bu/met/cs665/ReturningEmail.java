/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: ReturningEmail.java
 * Description: Class for creating returning customer email objects
 */

package edu.bu.met.cs665;

public class ReturningEmail implements Email{
    
    /**
     * Generates a returning customer email template
     * @return the returning customer email string
     */
    @Override
    public String generateEmail() {
        return "Welcome Back,\nWe appreciate your continued support.\n"
             + "Sincerely,\nThe Company Team";
    }
}
