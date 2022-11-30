package org.sanket.Models;

import java.util.HashSet;
import java.util.Set;
public class RegistryOfBank implements Registry<Bank> {
    private Set<Bank> mem;

    public RegistryOfBank(){
        this.mem = new HashSet<Bank>();
    }
    @Override
    public boolean remove(Bank bank) {
        return false;
    }

    @Override
    public boolean add(Bank bank) {
        var isGood = this.mem.add(bank);
        return false;
    }

    public int size(){
        return this.mem.size();
    }

    public boolean isEmpty(){
        return this.mem.isEmpty();
    }

    public boolean contains(Bank bank) {
        return this.mem.contains(bank);
    }
}
