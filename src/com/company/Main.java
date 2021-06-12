package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //      ArrayList to store objects
    static ArrayList<Entry> userEntry = new ArrayList<>();

    public static void main(String[] args) {
        welcomePage();
    }

    public static void welcomePage() {
//      Scanner to take in user's selection
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
        } else if (option == 2){
            removeEntry();
        }else if (option == 4) {
            printAddressBook();
        }else if (option == 5){
            deleteAddressBook();
        }
        else if ( option == 6) {
            quitProgram();
        }
        else {
            System.out.println("Still coding!");
        }
        }

//      Method for adding a new entry
        public static void addEntry() {

//      Scanner to take in user entries
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

//      Back to welcome page
            welcomePage();
        }

//      Method to remove an entry based off email input by user
        public static void removeEntry(){
        Scanner input = new Scanner(System.in);
            System.out.println("\n***** Removing an Entry *****");
            System.out.println("Enter the email for the entry you want to remove: ");
            String emailToRemove = input.nextLine();



        }

//      Method to print entire address book
        public static void printAddressBook(){
            System.out.println(userEntry);
            welcomePage();
        }

//      Method to delete entire address book
        public static void deleteAddressBook(){
            userEntry.clear();
            System.out.println("\n***** Deleting the Entire Address Book *****");
            System.out.println("All data in Address Book is deleted!");
            welcomePage();
        }

//      Method to quit the program
        public static void quitProgram() {
            System.out.println("Thanks! See you next time.");
        }

}



