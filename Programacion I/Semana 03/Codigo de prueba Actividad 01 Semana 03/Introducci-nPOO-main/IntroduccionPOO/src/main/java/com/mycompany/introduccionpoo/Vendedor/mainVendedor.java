package com.mycompany.introduccionpoo.Vendedor;

import java.util.Scanner;

public class mainVendedor {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("¿Cuánto vale cada articulo?");
        double valorUnitario = input.nextDouble();
        System.out.println("¿Cuántos artículos se vendieron en el mes");
        int cantVendida = input.nextInt();
        
        Vendedor v = new Vendedor(valorUnitario, cantVendida);
        System.out.println(v.obtenerSueldo());
    }
}
