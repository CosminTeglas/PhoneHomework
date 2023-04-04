package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the clas of contacts
 * @param: - firstName;
 * @param: - lastName;
 * @param - phoneNumber;
 */

public class Contact {
    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    String firstName;
    String lastName;
    String phoneNumber;
    List<String> messages = new ArrayList<>();
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " phone number: " + phoneNumber;
    }

}
