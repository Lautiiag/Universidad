/*
Suma de Números Pares (while).
Escribe un programa que solicite números al usuario y sume solo los
números pares. El ciclo debe continuar hasta que el usuario ingrese el número
0, momento en el que se debe mostrar la suma total de los pares ingresados.
Ejemplo de entrada/salida:
Ingrese un número (0 para terminar): 4
Ingrese un número (0 para terminar): 7
Ingrese un número (0 para terminar): 2
Ingrese un número (0 para terminar): 0
La suma de los números pares es: 6
 */
//Importante Aclaración: A partir de este ejercicio las variables están en
//español porque empecé a apurar el paso.
import java.util.Scanner;
public class Ejercicio_05 {
    public static void sumaPares(int numero, int sumaPares){
        Scanner sc = new Scanner(System.in);
        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        System.out.println("La suma de los números pares es: " + sumaPares);
        }
        sc.close();
    }
    public static void main(String[] args) {
        int sumaPares = 0;
        int numero = -1;
        sumaPares(numero, sumaPares);
    }
}