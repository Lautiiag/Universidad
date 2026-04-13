/*
Contador de Positivos, Negativos y Ceros (for).
Escribe un programa que pida al usuario ingresar 10 números enteros y
cuente cuántos son positivos, negativos y cuántos son ceros.
Ejemplo de entrada/salida:
Ingrese el número 1: -5
Ingrese el número 2: 3
Ingrese el número 3: 0
Ingrese el número 4: -1
Ingrese el número 5: 6
Ingrese el número 6: 0
Ingrese el número 7: 9
Ingrese el número 8: -3
Ingrese el número 9: 4
Ingrese el número 10: -8
Resultados:
Positivos: 4
Negativos: 4
Ceros: 2
 */

import java.util.Scanner;
public class Ejercicio_06 {

    public static void contarNumeros() {
        Scanner sc = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            int numero = pedirNumero(sc, i);

            if (numero > 0) positivos++;
            else if (numero < 0) negativos++;
            else ceros++;
        }

        mostrarResultados(positivos, negativos, ceros);
        sc.close();
    }

    public static int pedirNumero(Scanner sc, int indice) {
        System.out.print("Ingrese el número " + indice + ": ");
        System.out.print(": ");

        return Integer.parseInt(sc.nextLine());
    }

    public static void mostrarResultados(int p, int n, int c) {
        System.out.println("Resultados:\nPositivos: " + p + "\nNegativos: " + n + "\nCeros: " + c);
    }

    public static void main(String[] args) {
        contarNumeros();
    }

}
