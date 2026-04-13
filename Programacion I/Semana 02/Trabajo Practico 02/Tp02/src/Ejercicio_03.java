/*
Clasificación de Edad.
Escribe un programa en Java que solicite al usuario su edad y clasifique su
etapa de vida según la siguiente tabla:
Menor de 12 años: "Niño"
Entre 12 y 17 años: "Adolescente"
Entre 18 y 59 años: "Adulto"
60 años o más: "Adulto mayor"
Ejemplo de entrada/salida:
Ingrese su edad: 25
Eres un Adulto.
Ingrese su edad: 10
Eres un Niño.
 */

import java.util.Scanner;
public class Ejercicio_03 {
    static Scanner  sc = new Scanner(System.in);
    public static int ageInput(){
        System.out.print("Ingrese su edad: ");
        return Integer.parseInt(sc.nextLine());
    }
    public static void main(String[] args) {
        int age = ageInput();
        if (age < 12) {
            System.out.println("Usted es niño/a.");
        } else if (age <= 17) {
            System.out.println("Usted es adolescente.");
        } else if (age <= 59) {
            System.out.println("Usted es adulto/a.");
        } else {
            System.out.println("Usted es adulto/a mayor.");
        }
        sc.close();
    }
}
