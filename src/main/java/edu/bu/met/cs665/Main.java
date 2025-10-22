/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: Main.java
 * Description: Entry point for the application
 */

package edu.bu.met.cs665;


/**
 * This is the Main class.
 */
public class Main {


  public static void main(String[] args) {

    /**
     * Create an instance of each of the email types
     */
    
    Email businessEmail = EmailFactory.createEmail(CustomerType.BUSINESS);
    System.out.println("\nBusiness Email:\n");
    System.out.println(businessEmail.generateEmail());

    Email newCustomerEmail = EmailFactory.createEmail(CustomerType.NEW);
    System.out.println("\nNew Customer Email:\n");
    System.out.println(newCustomerEmail.generateEmail());

    Email returningEmail = EmailFactory.createEmail(CustomerType.RETURNING);
    System.out.println("\nReturning Customer Email:\n");
    System.out.println(returningEmail.generateEmail());

    Email frequentEmail = EmailFactory.createEmail(CustomerType.FREQUENT);
    System.out.println("\nFrequent Customer Email:\n");
    System.out.println(frequentEmail.generateEmail());

    Email vipEmail = EmailFactory.createEmail(CustomerType.VIP);
    System.out.println("\nVIP Customer Email:\n");
    System.out.println(vipEmail.generateEmail());
  }
}
