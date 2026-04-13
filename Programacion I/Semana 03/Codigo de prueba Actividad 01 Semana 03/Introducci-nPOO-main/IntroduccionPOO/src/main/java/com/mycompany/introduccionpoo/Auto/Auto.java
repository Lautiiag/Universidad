package com.mycompany.introduccionpoo.Auto;

public class Auto {
    // Atributos
    private String patente;
    private String marca;
    private String color;
    private int km;
    private boolean encendido;

    // Constructor
    public Auto(String patente, String marca, String color, int km) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.encendido = false; // Al crear el auto, está apagado
    }

    // Métodos
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El auto se ha encendido.");
        } else {
            System.out.println("El auto ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El auto se ha apagado.");
        } else {
            System.out.println("El auto ya está apagado.");
        }
    }

    public void acelerar(int cantidad) {
        if (encendido) {
            km += cantidad;
            System.out.println("El auto ha acelerado. Kilometraje actual: " + km + " km");
        } else {
            System.out.println("El auto está apagado, no puede acelerar.");
        }
    }

    public void frenar() {
        if (encendido) {
            System.out.println("El auto ha frenado.");
        } else {
            System.out.println("El auto está apagado, no puede frenar.");
        }
    }

    public void cambiarDeColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color del auto ha cambiado a: " + color);
    }

    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Kilometraje: " + km + " km");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
