package unitone.codeConventions;

public class PackageNames {
    /* Packages names are always lowercase:
    package com.mycompany.onlineshop;
    package database.models;
    package utilities.stringhelpers;

    breakdown:
    com - is the top folder
    .mycompany - is the subfolder inside com
    .onlineshop -is the subfolder inside mycompany

    What is a package: A folder/directory that organizes java files
    */

    public class BankAccount {
        
        // CONTANTS (public static final) - first
        public static final double INTEREST_RATE = 0.05;

        // STATIC VARIABLES (class-level) - second
        private static int totalAccounts = 0;

        // INSTANCE VARIABLES (attributes) = third
        private String accountNumber;
        private double balance;

        // CONSTRUCTORS - fourth
        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            totalAccounts++;
        }

        // METHODS - last
        public void deposit(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }
}
