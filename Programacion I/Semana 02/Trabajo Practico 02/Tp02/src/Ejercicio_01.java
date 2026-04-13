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

    public static void bisiesto(int anio){
        if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
            System.out.println("El año "+ anio + " es bisiesto.");
        } else {
            System.out.println("El año "+ anio + " no es bisiesto.");
        }
    }

    public static int ingresarAnio() {
        System.out.print("Ingrese un año: ");
        return Integer.parseInt(sc.nextLine());
    }

    public static void main(String[] args) {
        bisiesto(ingresarAnio());
        sc.close();
    }
}
