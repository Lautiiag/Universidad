import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el valor de b: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println(a / b);
        System.out.println((double) a / b);

        sc.close();
    }
}
