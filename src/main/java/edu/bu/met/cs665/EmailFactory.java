/**
 * Name: Keith Kwan
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/21/2025
 * File Name: EmailFactory.java
 * Description: Factory class for creating email objects
 */

package edu.bu.met.cs665;

public class EmailFactory {
    private EmailFactory() {
        // Private constructor to prevent instantiation
    }
    
    /**
     * Creates an email object based on customer type
     * @param type
     * @return the email object
     */
    public static Email createEmail(CustomerType type){
        switch (type) {
            case BUSINESS:
                return new BusinessEmail();
            case RETURNING:
                return new ReturningEmail();
            case FREQUENT:
                return new FrequentEmail();
            case NEW:
                return new NewCustomerEmail();
            case VIP:
                return new VipEmail();
            default:
                throw new IllegalArgumentException("Unknown customer type: " + type);
        }
    }
}
