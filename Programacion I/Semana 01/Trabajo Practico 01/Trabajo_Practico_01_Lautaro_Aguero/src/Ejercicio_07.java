import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {

        //    public class ErrorEjemplo {
        //        public static void main(String[] args) {
        //            Scanner scanner = new Scanner(System.in);
        //            System.out.print("Ingresa tu nombre: ");
        //            String nombre = scanner.nextInt(); // ERROR
        //            System.out.println("Hola, " + nombre);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();  //Se usa scanner.nextLine(), no scanner.nextInt(). La variable es String.

        System.out.println("Hola, " + nombre);

        scanner.close(); //El Scanner no estaba cerrado
    }
}
