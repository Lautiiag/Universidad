/*
Determinar el Mayor de Tres Números.
Escribe un programa en Java que pida al usuario tres números enteros y
determine cuál es el mayor.
Ejemplo de entrada/salida:
Ingrese el primer número: 8
Ingrese el segundo número: 12
Ingrese el tercer número: 5
El mayor es: 12
*/

import java.util.Scanner;
public class Ejercicio_02 {
    static Scanner sc = new Scanner(System.in);

    public static int ingresarNumero(String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    public static void verificarMayor(int a, int b, int c){

        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a + ".");
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es " + b + ".");
        } else {
            System.out.println("El mayor es " + c + ".");
        }
    }

    public static void main(String[] args) {
        int a = ingresarNumero("Ingrese el primer número: ");
        int b = ingresarNumero("Ingrese el segundo número: ");
        int c = ingresarNumero("Ingrese el tercer número: ");
        verificarMayor(a, b, c);
        sc.close();
    }

}
