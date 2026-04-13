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
import java.util.Scanner;
public class Ejercicio_05 {

    public static void sumaPares(){
        Scanner sc = new Scanner(System.in);
        int sumaPares = 0;
        int numero = -1; //Se inica en número impar y negativo para asegurar que se entre al ciclo while y no se sume.

        while (numero != 0) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(sc.nextLine());

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        System.out.println("La suma de los números pares es: " + sumaPares);
        }
        sc.close();
    }

    public static void main(String[] args) {
        sumaPares();
    }
}
