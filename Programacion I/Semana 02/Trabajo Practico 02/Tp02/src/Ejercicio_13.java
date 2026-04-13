/*
Impresión recursiva de arrays antes y después de modificar un elemento.
Crea un programa que:
a. Declare e inicialice un array con los precios de algunos productos.
b. Use una función recursiva para mostrar los precios originales.
c. Modifique el precio de un producto específico.
d. Use otra función recursiva para mostrar los valores modificados.
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
✔ Recorrido del array con una función recursiva en lugar de un bucle.
✔ Modificación de un valor en un array mediante un índice.
✔ Uso de un índice como parámetro en la recursión para recorrer el
array.
 */

public class Ejercicio_13 {

    public static void gestionarPreciosRecursivos() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);

        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
    }

    public static void mostrarPreciosRecursivo(double[] listaPrecios, int indice) {
        if (indice == listaPrecios.length) {
            return;
        }

        System.out.println("Precio: $" + listaPrecios[indice]);

        mostrarPreciosRecursivo(listaPrecios, indice + 1);
    }

    public static void main(String[] args) {
        gestionarPreciosRecursivos();
    }
}