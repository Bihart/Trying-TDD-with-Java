package org.sanket.Models;

import java.util.Date;

public class Transaccion {
    private double montoDeTransacción;
    private Cuenta cuentaObjetivo;
    private String cuentaFuente;
    private String tipo;
    private Date fechaDeLaTransacción;

    public Transaccion(double montoDeTransacción, Cuenta cuentaObjetivo, String cuentaFuente, String tipo,
                       Date fechaDeLaTransacción) {
        this.montoDeTransacción = montoDeTransacción;
        this.cuentaObjetivo = cuentaObjetivo;
        this.cuentaFuente = cuentaFuente;
        this.tipo = tipo;
        this.fechaDeLaTransacción = fechaDeLaTransacción;
    }
}
