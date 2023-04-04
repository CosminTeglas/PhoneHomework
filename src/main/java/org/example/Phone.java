package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class of phone. It contains 9 methods.
 *
 */
public class Phone {
    final int batteryLife;
    int phoneBattery;
    List<Contact> phoneContacts = new ArrayList<>();
    List<Contact> phoneCalls = new ArrayList<>();

    /**
     * This is the constructor of the class phone.
     * @param batteryLife
     */
    public Phone(int batteryLife) {
        this.batteryLife = batteryLife;
        this.phoneBattery = batteryLife;
    }

    /**
     * This is a method that add a contact to the phone contacts list.
     * @param firstName
     * @param lastName
     * @param phoneNumber
     */

    public void addContact(String firstName , String lastName, String phoneNumber) {
        Contact contact = new Contact( firstName ,  lastName,  phoneNumber);
        phoneContacts.add(contact);
        System.out.println("New contact added: " + contact);
    }

    /**
     * This is a method that gets the fist contact.
     */
    public void getFirstContact(){
        System.out.println("First contact: " + phoneContacts.get(0));

    }
    /**
     * This is a method that gets the last contact.
     */
    public void getLastContact(){
        System.out.println("Last contact: " + phoneContacts.get(phoneContacts.size() - 1));
    }

    /**
     * This is a method that sends a message via phone number.
     * @param phoneNumber
     * @param message
     */
    public void sendMessage(String phoneNumber, String message){
        if(message.chars().count() > 500){
            System.out.println("Message is too long.");
            return;
        }
        for (Contact contact: phoneContacts
             ) {
            if(phoneNumber.equals(contact.phoneNumber)){
                contact.messages.add(message);
                phoneBattery -= 1;
            }

        }
    }

    /**
     * This is a method that gets the first message.
     * @param phoneNumber
     */
    public void getFirstMessage(String phoneNumber){
        for(Contact contact : phoneContacts){
            if(contact.phoneNumber.equals(phoneNumber)){
                System.out.println("First message is: " + contact.messages.get(0));
            }
        }
    }

    /**
     * This is a method that gets the second message.
     * @param phoneNumber
     */
    public void getSecondMessage(String phoneNumber){
        for(Contact contact : phoneContacts){
            if(contact.phoneNumber.equals(phoneNumber)){
                System.out.println("Second message is: " + contact.messages.get(1));
            }
        }
    }

    /**
     * This is a method that calls a phone number from contacts.
     * @param phoneNumber
     */
    public void call(String phoneNumber){
        for(Contact contact : phoneContacts){
            if(contact.phoneNumber.equals(phoneNumber)){
                System.out.println("Calling: " +contact.firstName + " " + contact.lastName + " " + contact.phoneNumber);
                phoneCalls.add(contact);
                phoneBattery -= 2;
            }
        }
    }

    /**
     * This is a method that prints the history of calls.
     */
    public void viewHistory(){
        System.out.println("Recent calls: " +phoneCalls);
    }
}
