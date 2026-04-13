/*
Actualización de stock a partir de venta y recepción de productos.
Crea un metodo actualizarStock(int stockActual, int cantidadVendida,
int cantidadRecibida), que calcule el nuevo stock después de una venta y
recepción
de productos:
NuevoStock = StockActual − CantidadVendida + CantidadRecibida
NuevoStock = CantidadVendida + CantidadRecibida
Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
cantidad recibida, y muestra el stock actualizado.
Ejemplo de entrada/salida:
Ingrese el stock actual del producto: 50
Ingrese la cantidad vendida: 20
Ingrese la cantidad recibida: 30
El nuevo stock del producto es: 60
 */
import java.util.Scanner;
public class Ejercicio_10 {

    public static void gestionarInventario() {
        Scanner sc = new Scanner(System.in);

        int stockActual = pedirEntero(sc, "Ingrese el stock actual del producto: ");
        int cantidadVendida = pedirEntero(sc, "Ingrese la cantidad vendida: ");
        int cantidadRecibida = pedirEntero(sc, "Ingrese la cantidad recibida: ");

        if (stockActual < 0 || cantidadVendida < 0 || cantidadRecibida < 0) {
            System.out.println("Error: Los valores de stock y cantidades no pueden ser negativos.");
        }
        else if (cantidadVendida > stockActual) {
            System.out.println("Error: La cantidad vendida supera al stock actual.");
        }
        else {
            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            mostrarResultado(nuevoStock);
        }

        sc.close();
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static int pedirEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    public static void mostrarResultado(int nuevoStock) {
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }

    public static void main(String[] args) {
        gestionarInventario();
    }

}