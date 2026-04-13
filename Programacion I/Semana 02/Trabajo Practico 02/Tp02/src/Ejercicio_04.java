/*
Calculadora de Descuento según categoría. (switch)
Escribe un programa que solicite al usuario el precio de un producto y
su categoría (A, B o C).
Luego, aplique los siguientes descuentos:
Categoría A: 10% de descuento
Categoría B: 15% de descuento
Categoría C: 20% de descuento
El programa debe mostrar el precio original, el descuento aplicado y el
precio final
Ejemplo de entrada/salida:
Ingrese el precio del producto: 1000
Ingrese la categoría del producto (A, B o C): B
Descuento aplicado: 15%
Precio final: 850.0
 */

import java.util.Scanner;
public class Ejercicio_04 {
    static Scanner sc = new Scanner(System.in);

    public static double ingresarPrecio() {
        System.out.print("Ingrese el precio del producto: ");
        return Double.parseDouble(sc.nextLine());
    }

    public static char ingresarCategoria(){
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String input = sc.nextLine();
        return input.toUpperCase().charAt(0);
    }

    static final double DESC_A = 0.90;
    static final double DESC_B = 0.85;
    static final double DESC_C = 0.80;

    public static double aplicarDescuento(char categoria, double precioOriginal) {
        switch (categoria) {
            case 'A':
                precioOriginal = precioOriginal * DESC_A;
                break;
            case 'B':
                precioOriginal = precioOriginal * DESC_B;
                break;
            case 'C':
                precioOriginal = precioOriginal * DESC_C;
                break;
            default:
                System.out.println("No se realizó ningún descuento.");
                break;
        }
        return precioOriginal;
    }

    public static double porcentaje(double precioOriginal, double precioFinal){
        double cantidadDescuento = precioOriginal - precioFinal;
        return (cantidadDescuento * 100.0) / precioOriginal;
    }

    public static void main(String[] args) {
        double precioOriginal = ingresarPrecio();
        char categoria = ingresarCategoria();
        double precioFinal = aplicarDescuento(categoria, precioOriginal);
        double porcentajeAplicado = porcentaje(precioOriginal, precioFinal);
        System.out.println("Precio original: " + precioOriginal + " pesos.");
        System.out.println("Descuento realizado: " + (int)porcentajeAplicado + "%.");
        System.out.println("Precio final: " + precioFinal + " pesos.");
    sc.close();
    }
}
