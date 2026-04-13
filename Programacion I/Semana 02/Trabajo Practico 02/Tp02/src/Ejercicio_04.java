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
    public static double inputPrice() {
        System.out.print("Ingrese el precio del producto: ");
        return Double.parseDouble(sc.nextLine());
    }
    public static char inputCategory(){
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String input = sc.nextLine();
        return input.toUpperCase().charAt(0);
    }
    public static double applyDiscount(char category, double originalPrice) {
        switch (category) {
            case 'A':
                originalPrice = originalPrice * DESC_A;
                break;
            case 'B':
                originalPrice = originalPrice * DESC_B;
                break;
            case 'C':
                originalPrice = originalPrice * DESC_C;
                break;
            default:
                System.out.println("No se realizó ningún descuento.");
                break;
        }
        return originalPrice;
    }
    static final double DESC_A = 0.90;
    static final double DESC_B = 0.85;
    static final double DESC_C = 0.80;
    public static double percent(double originalPrice, double finalPrice){
        double discountAmount = originalPrice - finalPrice;
        return (discountAmount * 100.0) / originalPrice;
    }

    public static void main(String[] args) {
        double originalPrice = inputPrice();
        char category = inputCategory();
        double finalPrice = applyDiscount(category, originalPrice);
        double percentApplied = percent(originalPrice, finalPrice);
        System.out.println("Precio original: " + originalPrice + " pesos.");
        System.out.println("Descuento realizado: " + (int)percentApplied + "%.");
        System.out.println("Precio final: " + finalPrice + " pesos.");
    sc.close();
    }
}
