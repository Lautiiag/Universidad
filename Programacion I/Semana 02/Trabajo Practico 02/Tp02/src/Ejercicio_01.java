/*
Verificación de Año Bisiesto.
Escribe un programa en Java que solicite al usuario un año y determine si es
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
divisible por 400.
Ejemplo de entrada/salida:
Ingrese un año: 2024
El año 2024 es bisiesto.
Ingrese un año: 1900
El año 1900 no es bisiesto.
*/
import java.util.Scanner;
public class Ejercicio_01 {
    static Scanner sc = new Scanner(System.in);
    public static void anioBisiesto(int year){
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("El año "+ year + " es bisiesto.");
        } else {
            System.out.println("El año "+ year + " no es bisiesto.");
        }
        sc.close();
    }
    public static void main(String[] args) {
        System.out.print("Ingrese un año: ");
        int year = Integer.parseInt(sc.nextLine());
        anioBisiesto(year);

    }
}
