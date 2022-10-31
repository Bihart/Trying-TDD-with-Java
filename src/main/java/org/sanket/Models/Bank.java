package org.sanket.Models;

public class Bank {
    private String noBank;
    private String name;
    private double maxMountByTransaction;
    private double minMountByTransaction;
    private double priceByTransaction;
    private double interestByYear;

    public Bank(String noBank, String name, double maxMountByTransaction, double minMountByTransaction,
                double priceByTransaction, double interestByYear) {
        this.noBank = noBank;
        this.name = name;
        this.maxMountByTransaction = maxMountByTransaction;
        this.minMountByTransaction = minMountByTransaction;
        this.priceByTransaction = priceByTransaction;
        this.interestByYear = interestByYear;
    }
}
