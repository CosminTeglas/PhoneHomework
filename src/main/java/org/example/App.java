package org.example;

/**
 * This is the class that contains main method.
 */
public class App {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxy6(100,"green","aluminium","3993");

        phone.addContact("Cosmin", "Teglas", "071231238");

        phone.addContact("Mihai", "Popovici", "073213219");

        phone.getFirstContact();

        phone.getLastContact();

        phone.sendMessage("073213219", "Salut");

        phone.sendMessage("073213219", "Hello");

        phone.getFirstMessage("073213219");

        phone.getSecondMessage("073213219");

        phone.call("073213219");

        phone.viewHistory();
    }
}
