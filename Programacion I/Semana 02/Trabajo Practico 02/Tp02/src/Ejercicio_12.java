/*
Modificación de un array de precios y visualización de resultados.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Muestre los valores originales de los precios.
c. Modifique el precio de un producto específico.
d. Muestre los valores modificados.
Salida esperada:
Precios originales:
Precio: $199.99
Precio: $299.5
Precio: $149.75
Precio: $399.0
Precio: $89.99
Precios modificados:
Precio: $199.99
Precio: $299.5
Precio: $129.99
Precio: $399.0
Precio: $89.99
Conceptos Clave Aplicados:
✔ Uso de arrays (double[]) para almacenar valores.
✔ Recorrido del array con for-each para mostrar valores.
✔ Modificación de un valor en un array mediante un índice.
✔ Reimpresión del array después de la modificación
 */

public class Ejercicio_12 {

    public static void gestionarPrecios() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        modificarPrecio(precios, 2, 129.99);

        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);
    }

    public static void mostrarPrecios(double[] listaPrecios) {
        for (double precio : listaPrecios) {
            System.out.println("Precio: $" + precio);
        }
    }

    public static void modificarPrecio(double[] listaPrecios, int indice, double nuevoPrecio) {
        if (indice >= 0 && indice < listaPrecios.length) {
            listaPrecios[indice] = nuevoPrecio;
        } else {
            System.out.println("Error: Índice fuera de rango.");
        }
    }

    public static void main(String[] args) {
        gestionarPrecios();
    }

}