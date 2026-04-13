
import java.io.*;

// Interfaces con métodos por defecto: crea el problema del diamante si no se maneja correctamente.
interface A {
    default void show() {
        System.out.println("A show");
    }
}

interface B {
    default void show() {
        System.out.println("B show");
    }
}

// Herencia múltiple por interfaces. Resolveremos el problema del diamante aquí.
class C implements A, B {
    @Override
    public void show() {
        // Se elige explícitamente qué método usar.
        A.super.show(); // O B.super.show(); según el comportamiento deseado
    }
}

// Clase abstracta
abstract class Figura {
    abstract double area();
}

// Modelo basado en interfaces
interface Dibujable {
    void dibujar();
}

// Clase concreta que hereda de Figura e implementa Dibujable
class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio: " + radio);
    }
}

// Excepción personalizada (checked)
class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensaje) {
        super(mensaje);
    }
}

// Excepción personalizada (unchecked)
class ErrorGraveException extends RuntimeException {
    public ErrorGraveException(String mensaje) {
        super(mensaje);
    }
}

public class Main {
    public static void main(String[] args) {
        // Herencia múltiple + diamante
        C obj = new C();
        obj.show();

        // Polimorfismo
        Figura f = new Circulo(3);
        System.out.println("Área: " + f.area());

        // Manejo de errores con try-catch-finally y multicatch
        try {
            procesarArchivo("datos.txt");
        } catch (FileNotFoundException | ValorInvalidoException e) {
            System.err.println("Error controlado: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        } finally {
            System.out.println("Finalizando operación...");
        }
    }

    // Try-with-resources y uso de throw/throws
    public static void procesarArchivo(String nombreArchivo) throws IOException, ValorInvalidoException {
        File archivo = new File(nombreArchivo);



        // Lectura usando try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea = br.readLine();
            if (linea == null || linea.isEmpty()) {
                throw new ValorInvalidoException("El archivo está vacío o contiene datos inválidos.");
            }
            if (linea.equals("FATAL")) {
                throw new ErrorGraveException("Se detectó un error grave.");
            }
            System.out.println("Contenido: " + linea);
        }
    }

}

