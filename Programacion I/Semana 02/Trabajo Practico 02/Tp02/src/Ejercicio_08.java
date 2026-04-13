/*
Cálculo del Precio Final con impuesto y descuento.
Crea un metodo calcularPrecioFinal(double, precioBase, double
impuesto, double descuento) que calcule el precio final de un producto en un
e-commerce. La fórmula es:
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento)
Desde main(), solicita el precio base del producto, el porcentaje de
impuesto y el porcentaje de descuento, llama al metodo y muestra el precio
final.
Ejemplo de entrada/salida:
Ingrese el precio base del producto: 100
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
El precio final del producto es: 105.0
 */

import java.util.Scanner;
public class Ejercicio_08 {

    public static void procesarCompra() {
        Scanner sc = new Scanner(System.in);

        double precioBase = pedirDato(sc, "Ingrese el precio base del producto: ");
        double impuesto = pedirDato(sc, "Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double descuento = pedirDato(sc, "Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");

        if (precioBase < 0 || impuesto < 0 || descuento < 0) {
            System.out.println("Error: Los valores ingresados no pueden ser negativos.");
        } else {
            double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
            mostrarResultado(precioFinal);
        }

        sc.close();
    }

    public static double pedirDato(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double montoImpuesto = precioBase * (impuesto / 100);
        double montoDescuento = precioBase * (descuento / 100);

        return precioBase + montoImpuesto - montoDescuento;
    }

    public static void mostrarResultado(double precioFinal) {
        System.out.println("El precio final del producto es: " + precioFinal);
    }

    public static void main(String[] args) {
        procesarCompra();
    }

}