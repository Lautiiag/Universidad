import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese entero a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese entero b: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));

        sc.close();
    }
}
