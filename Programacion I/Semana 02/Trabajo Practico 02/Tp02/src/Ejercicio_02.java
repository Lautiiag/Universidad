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
    public static int numInput(String message) {
        System.out.print(message);
        return Integer.parseInt(sc.nextLine());
    }
    public static void main(String[] args) {
        int a = numInput("Ingrese el primer número: ");
        int b = numInput("Ingrese el segundo número: ");
        int c = numInput("Ingrese el tercer número: ");

        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a + ".");
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es " + b + ".");
        } else {
            System.out.println("El mayor es " + c + ".");
        }
        sc.close();

    }
}
