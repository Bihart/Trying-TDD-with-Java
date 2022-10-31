package org.sanket.Models;

public class Person {
    private String nombre;
    private String apellidos;
    private String noCedula;
    private String profecion;
    private String noCuenta;

    public Person(String nombre, String apellidos,
                  String noCedula, String profecion,
                  String noCuenta)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.noCedula = noCedula;
        this.profecion = profecion;
        this.noCuenta = noCuenta;
    }

    public Person(String nombre, String apellidos,
                  String noCedula, String noCuenta) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.noCedula = noCedula;
        this.noCuenta = noCuenta;
        this.profecion = "desempleado";
    }
}