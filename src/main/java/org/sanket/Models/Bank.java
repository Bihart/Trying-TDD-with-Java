package org.sanket.Models;

import java.util.Objects;

public class Bank implements Cloneable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Double.compare(bank.maxMountByTransaction, maxMountByTransaction) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(noBank);
    }

    public Bank clone() throws CloneNotSupportedException {
        return (Bank) super.clone();
    }

}
