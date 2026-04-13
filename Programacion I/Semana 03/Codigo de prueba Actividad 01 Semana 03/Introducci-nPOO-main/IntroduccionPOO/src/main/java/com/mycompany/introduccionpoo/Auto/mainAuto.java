package com.mycompany.introduccionpoo.Auto;

public class mainAuto {
    public static void main(String[] args) {
        // Creamos un objeto Auto
        Auto miAuto = new Auto("ABC123", "Toyota", "Rojo", 10000);

        // Mostrar información del auto
        miAuto.mostrarInformacion();

        // Encender el auto
        miAuto.encender();

        // Acelerar
        miAuto.acelerar(50);

        // Cambiar de color
        miAuto.cambiarDeColor("Azul");

        // Frenar
        miAuto.frenar();

        // Apagar el auto
        miAuto.apagar();

        // Mostrar información actualizada
        System.out.println("\nInformación actualizada:");
        miAuto.mostrarInformacion();
    }
}
  