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

//      While loop to continue program after user selects command
//        while(true) {
//            int option = input.nextInt();
//            if (option == 1) {
//                addEntry();
//            }else if (option == 6) {
//                quitProgram();
//                break;
//            }else if (option == 2){
//                removeEntry();
//            }
//            else{
//                System.out.println("Still coding!");
//                break;
//            }
//        }
        if (option == 1) {
            addEntry();
        } else if (option == 2) {
            removeEntry();
        } else if (option == 4) {
            printAddressBook();
        } else if (option == 5) {
            deleteAddressBook();
        } else if (option == 6) {
            quitProgram();
        } else {
            System.out.println("Invalid input, try again!");
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
        System.out.println("New entry is added!");

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
            }
        }
    }
//            } else if (!userEntry.get(i).getEmailAddress().equals(emailToRemove)){
//                System.out.println("Entry not found...Sending you back to Welcome Page.");
//                welcomePage();
//            }
//                System.out.println("Entry found: " + userEntry.get(i) + "\nIs this the entry you want to remove? Type Y or N.");
//                String confirmDelete = input.nextLine();
//                if (confirmDelete.equals("Y") || confirmDelete.equals("y") || confirmDelete.equals("Yes") || confirmDelete.equals("yes")) {
//                    userEntry.remove(i);
//                    System.out.println("Entry deleted!");
//                    welcomePage();
//                } else if (confirmDelete.equals("N") || confirmDelete.equals("n") || confirmDelete.equals("No") || confirmDelete.equals("no")) {
//                    System.out.println("No entry will be deleted.");
//                    welcomePage();
//                }

//      No. 3 - Method to search for an entry
    public static void searchEntry(){
        Scanner input = new Scanner(System.in);
        System.out.println("How do you want to search for an entry? Please enter a number 1 - 4.\n");
        System.out.println("1) First name");
        System.out.println("2) Last name");
        System.out.println("3) Phone Number");
        System.out.println("4) Email Address");
        int searchMethod = input.nextInt();

    }

//      No. 4 - Method to print entire address book
    public static void printAddressBook() {
        if (userEntry.size() == 0){
            System.out.println("Address Book is empty!");
            welcomePage();
        } else {
            System.out.println("***** Printout of All Entries *****");
            System.out.println(userEntry);
            welcomePage();
        }
        }

//      No. 5 - Method to delete entire address book
    public static void deleteAddressBook() {
        userEntry.clear();
        System.out.println("\n***** Deleting the Entire Address Book *****");
        System.out.println("All data in Address Book is deleted!");
        welcomePage();
    }

//      No. 6 - Method to quit the program
    public static void quitProgram() {
        System.out.println("Thanks! See you next time.");
    }

}



