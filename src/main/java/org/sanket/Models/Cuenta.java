package org.sanket.Models;

import java.util.Date;

public class Cuenta extends Bank{
    private String noCuenta;
    private String dueñoDeLaCuenta;
    private String tipo;
    private double saldo;
    private Date fechaDeApertura;

    public Cuenta(String noBank, String name, double maxMountByTransaction, double minMountByTransaction,
                  double priceByTransaction, double interestByYear, String noCuenta, String dueñoDeLaCuenta,
                  String tipo, double saldo, Date fechaDeApertura) {
        super(noBank, name, maxMountByTransaction, minMountByTransaction, priceByTransaction, interestByYear);
        this.noCuenta = noCuenta;
        this.dueñoDeLaCuenta = dueñoDeLaCuenta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.fechaDeApertura = fechaDeApertura;
    }


}
