package test.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import org.sanket.Models.Bank;
import org.sanket.Models.Registry;
import org.sanket.Models.RegistryOfBank;

public class TestCreateBank {

    Registry<Bank> registryOfBank;
    Bank firstBank;

    @Before
    public void before(){
        registryOfBank = new RegistryOfBank();
        firstBank = new Bank(
                "1",
                "banco uno",
                200000.0,
                100000.0,
                10000.0,
                0.2
        );
    }

    @Test
    public void registryABank() {
        registryOfBank.add(firstBank);
        final boolean actual = registryOfBank.contains(firstBank);

        assertTrue(actual);
    }

    @Test
    public void registryExistBankByReference() {
        registryOfBank.add(firstBank);
        registryOfBank.add(firstBank);
        final int currSize = registryOfBank.size();

        assertEquals(1, currSize);
    }

    @Test
    public void registryExistBankByValue() throws  CloneNotSupportedException {
        var mirrorFirstBank = firstBank.clone();
        registryOfBank.add(firstBank);
        registryOfBank.add(mirrorFirstBank);
        final int currSize = registryOfBank.size();

        assertEquals(1, currSize);
    }

    @Test
    public void registryExistBankWithSameNoBank() {
        var bankWithSameNoBank = new Bank(
                "1",
                "banco dos",
                200000.0,
                100000.0,
                10000.0,
                0.2
        );
        registryOfBank.add(firstBank);
        registryOfBank.add(bankWithSameNoBank);

        final int currSize = registryOfBank.size();

        assertEquals(1, currSize);
    }
}
