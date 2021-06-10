package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        welcomePage();
        }

    public static void welcomePage() {
//      Scanner to take in user's selection
        Scanner input = new Scanner(System.in);
//      Prints options for user to choose
        System.out.println("**********");
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
        } else if (option == 6) {
            quitProgram();
        } else {
            System.out.println("Still coding!");
        }
    }
    //      Method for adding a new entry
        public static void addEntry () {
//      Scanner to take in user entries
            Scanner entryInput = new Scanner(System.in);
            System.out.println("**********");
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
        }

//      Method to quit the program
        public static void quitProgram() {
            System.out.println("Thanks! See you next time.");
        }

}



