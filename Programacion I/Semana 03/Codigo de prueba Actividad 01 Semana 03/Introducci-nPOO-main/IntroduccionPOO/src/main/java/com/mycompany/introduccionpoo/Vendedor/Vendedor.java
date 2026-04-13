package com.mycompany.introduccionpoo.Vendedor;

public class Vendedor {
    private static double COMISION = 0.16;
    private static double SUELDO_FIJO = 14000;
    private double valorUnitario;
    private int cantVendida;
    
    public Vendedor(double valorUnitario, int cantVendida){
        this.valorUnitario = valorUnitario;
        this.cantVendida = cantVendida;
    }
    
    public double obtenerSueldo(){
        return SUELDO_FIJO + (cantVendida * valorUnitario * COMISION);
    }
}
