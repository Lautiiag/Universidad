/*
Composición de funciones para calcular costo de envío y total de compra.
a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
envío basado en la zona de envío (Nacional o Internacional) y el peso del
paquete.
Nacional: $5 por kg
Internacional: $10 por kg
b. calcularTotalCompra(double precioProducto, double
costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
el costo de envío.
Desde main(), solicita el peso del paquete, la zona de envío y el precio
del producto. Luego, muestra el total a pagar.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 50
Ingrese el peso del paquete en kg: 2
Ingrese la zona de envío (Nacional/Internacional): Nacional
El costo de envío es: 10.0
El total a pagar es: 60.
 */

import java.util.Scanner;
public class Ejercicio_09 {

    public static void procesarPedido() {
        Scanner sc = new Scanner(System.in);

        double precio = pedirDouble(sc, "Ingrese el precio del producto: ");
        double peso = pedirDouble(sc, "Ingrese el peso del paquete en kg: ");
        String zona = pedirString(sc, "Ingrese la zona de envío (Nacional/Internacional): ");

        if (precio < 0 || peso < 0) {
            System.out.println("Error: El precio y el peso no pueden ser negativos.");
        } else {
            double costoEnvio = calcularCostoEnvio(peso, zona);

            if (costoEnvio != -1) {
                double total = calcularTotalCompra(precio, costoEnvio);
                System.out.println("El costo de envío es: " + costoEnvio);
                System.out.println("El total a pagar es: " + total);
            } else {
                System.out.println("Error: Zona de envío no reconocida.");
            }
        }

        sc.close();
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;
        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            return -1;
        }

        return peso * costoPorKg;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    public static String pedirString(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        procesarPedido();
    }

}