package com.mycompany.introduccionpoo.Factorial;

public class Calculadora {
    public int factorial(int num) {
        if (num < 0) {
            throw new RuntimeException("No se puede calcular el factorial de un número menor a 0");
        }
        
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
