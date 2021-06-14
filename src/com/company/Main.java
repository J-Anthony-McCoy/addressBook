package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    static ArrayList<Entry> userEntry = new ArrayList<>();

    public static void main(String[] args) {
        welcomePage();
    }

    public static void welcomePage() {

        Scanner input = new Scanner(System.in);

//      Prints options for user to choose
        System.out.println("\n***** Welcome Page *****");
        System.out.println("Hello! Welcome to Address Book. What would you like to do? Please enter a number 1 - 6.\n");
        System.out.println("1) Add an entry");
        System.out.println("2) Remove an entry");
        System.out.println("3) Search for a specific entry");
        System.out.println("4) Print Address Book");
        System.out.println("5) Delete Book");
        System.out.println("6) Quit");

        int option = input.nextInt();

        if (option == 1) {
            addEntry();
        } else if (option == 2) {
            removeEntry();
        } else if (option == 3) {
            searchEntry();
        } else if (option == 4) {
            printAddressBook();
        } else if (option == 5) {
            deleteAddressBook();
        } else if (option == 6) {
            quitProgram();
        } else {
            System.out.println("\nInvalid input, try again!");
            welcomePage();
        }
    }

    //      No. 1 - Method to add a new entry
    public static void addEntry() {

        Scanner entryInput = new Scanner(System.in);

        System.out.println("\n***** Adding a New Entry *****");
        System.out.println("Please add your entry. All fields are required.");
        System.out.println("First Name: ");
        String firstName = entryInput.nextLine();
        System.out.println("Last Name: ");
        String lastName = entryInput.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = entryInput.nextLine();
        System.out.println("Email Address: ");
        String emailAddress = entryInput.nextLine();
        System.out.println("\nNew entry is added!");

//      Object to store all user entry data
        Entry entry = new Entry(firstName, lastName, phoneNumber, emailAddress);
        entry.setFirstName(firstName);
        entry.setLastName(lastName);
        entry.setPhoneNumber(phoneNumber);
        entry.setEmailAddress(emailAddress);

//      Add last entry object into array list
        userEntry.add(entry);
        welcomePage();
    }

    //      No. 2 - Method to remove an entry
    public static void removeEntry() {
        if (userEntry.size() > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n***** Removing an Entry *****");
            System.out.println("Enter the email for the entry you want to remove: ");
            String emailToRemove = input.nextLine();
            for (int i = 0; i < userEntry.size(); i++) {
                if (userEntry.get(i).getEmailAddress().equals(emailToRemove)) {
                    System.out.println("Entry below was deleted!");
                    System.out.println(userEntry.get(i));
                    userEntry.remove(i);
                    welcomePage();
                    return;
                }
            }
            System.out.println("\nNo entry found!");
            welcomePage();

        } else {
            System.out.println("\nNo entries in Address Book to be removed!");
            welcomePage();
        }
    }

    //      No. 3 - Method to search for an entry
    public static void searchEntry() {
        if (userEntry.size() > 0) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Searching for an Entry *****");
        System.out.println("How do you want to search for an entry? Please enter a number 1 - 4.\n");
        System.out.println("1) First name");
        System.out.println("2) Last name");
        System.out.println("3) Phone Number");
        System.out.println("4) Email Address");

        String searchMethod = input.nextLine();

        if (searchMethod.equals("1")) {
            System.out.println("Enter the first letter of the first name you want to search for: ");
            String firstNameSearch = input.nextLine();
            for (Entry f : userEntry) {
                if (f.getFirstName().startsWith(firstNameSearch)) {
                    System.out.println("***** First Name Search Results *****");
                    System.out.println("First Name: " + f.getFirstName() +
                            "\nLast Name: " + f.getLastName() +
                            "\nPhone Number: " + f.getPhoneNumber() +
                            "\nEmail Address: " + f.getEmailAddress());
                    welcomePage();
                    return;
                }
            }
            System.out.println("\nNo entry found!");
            welcomePage();

        } else if (searchMethod.equals("2")) {
            System.out.println("Enter the first letter of the last name you want to search for: ");
            String lastNameSearch = input.nextLine();
            for (Entry l : userEntry) {
                if (l.getLastName().startsWith(lastNameSearch)) {
                    System.out.println("***** Last Name Search Results *****");
                    System.out.println("First Name: " + l.getFirstName() +
                            "\nLast Name: " + l.getLastName() +
                            "\nPhone Number: " + l.getPhoneNumber() +
                            "\nEmail Address: " + l.getEmailAddress());
                    welcomePage();
                    return;
                }
            }
            System.out.println("\nNo entry found!");
            welcomePage();

        } else if (searchMethod.equals("3")) {
            System.out.println("Enter the first digit for the phone number you want to search for: ");
            String phoneNumberSearch = input.nextLine();
            for (Entry p : userEntry) {
                if (p.getPhoneNumber().startsWith(phoneNumberSearch)) {
                    System.out.println("***** Phone Number Search Results *****");
                    System.out.println("First Name: " + p.getFirstName() +
                            "\nLast Name: " + p.getLastName() +
                            "\nPhone Number: " + p.getPhoneNumber() +
                            "\nEmail Address: " + p.getEmailAddress());
                    welcomePage();
                    return;
                }
            }
            System.out.println("\nNo entry found!");
            welcomePage();

        } else if (searchMethod.equals("4")) {
            System.out.println("Enter the first letter of the email address you want to search for: ");
            String emailAddressSearch = input.nextLine();
            for (Entry e : userEntry) {
                if (e.getEmailAddress().startsWith(emailAddressSearch)) {
                    System.out.println("***** Email Address Search Results *****");
                    System.out.println("First Name: " + e.getFirstName() +
                            "\nLast Name: " + e.getLastName() +
                            "\nPhone Number: " + e.getPhoneNumber() +
                            "\nEmail Address: " + e.getEmailAddress());
                    welcomePage();
                    return;
                }
            }
            System.out.println("\nNo entry found!");
            welcomePage();

        } else {
            System.out.println("\nInvalid input! Try again.\n");
            searchEntry();
        }
    } else {
            System.out.println("\nNo entries in Address Book to search!");
            welcomePage();
        }
        }

    //      No. 4 - Method to print entire address book
    public static void printAddressBook() {
        if (userEntry.size() == 0) {
            System.out.println("\nAddress Book is empty!");
            welcomePage();
        } else {
            System.out.println("***** Printout of All Entries *****");
            System.out.println(userEntry);
            welcomePage();
        }
    }

    //      No. 5 - Method to delete entire address book
    public static void deleteAddressBook() {
        if (userEntry.size() > 0) {
            userEntry.clear();
            System.out.println("\n***** Deleting the Entire Address Book *****");
            System.out.println("\nAll data in Address Book is deleted!");
            welcomePage();
        } else {
            System.out.println("\nNo data in Address Book to delete!");
            welcomePage();
        }
    }

    //      No. 6 - Method to quit the program
    public static void quitProgram() {
        System.out.println("\nThanks! See you next time.");
    }
}



