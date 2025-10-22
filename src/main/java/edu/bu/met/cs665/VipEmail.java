/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: VipEmail.java
 * Description: Class for creating VIP email objects
 */

package edu.bu.met.cs665;

public class VipEmail implements Email {

    /**
     * Generates a VIP customer email template
     * @return the VIP customer email string
     */
    @Override
    public String generateEmail() {
        return "Dear Esteemed VIP Customer,\n"
             + "Thank you for your continued loyalty and being a part of our VIP program.\n"
             + "We value your business greatly.\n"
             + "Best regards,\nThe VIP Team";
    }
}