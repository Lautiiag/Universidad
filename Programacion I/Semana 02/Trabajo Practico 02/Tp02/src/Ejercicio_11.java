/*
Cálculo de descuento especial usando variable global.
Declara una variable global DESCUENTO_ESPECIAL = 0.10. Luego, crea un
metodo calcularDescuentoEspecial(double precio) que use la variable global para
calcular el descuento especial del 10%.
Dentro del metodo, declara una variable local descuentoAplicado, almacena
el valor del descuento y muestra el precio final con descuento.
Ejemplo de entrada/salida:
Ingrese el precio del producto: 200
El descuento especial aplicado es: 20.0
El precio final con descuento es: 180.0
 */

import java.util.Scanner;
public class Ejercicio_11 {

    public static final double DESCUENTO_ESPECIAL = 0.10;

    public static void procesarDescuento() {
        Scanner sc = new Scanner(System.in);

        double precio = pedirPrecio(sc);

        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
        } else {
            calcularDescuentoEspecial(precio);
        }

        sc.close();
    }

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;

        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static double pedirPrecio(Scanner sc) {
        System.out.print("Ingrese el precio del producto: ");
        return Double.parseDouble(sc.nextLine());
    }

    public static void main(String[] args) {
        procesarDescuento();
    }

}