
import java.util.*;

// Clase genérica simple
class Caja<T> {
    private T contenido;

    public void guardar(T valor) {
        contenido = valor;
    }

    public T obtener() {
        return contenido;
    }
}

// Clase Persona con Comparable
class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

// Comparator externo por nombre
class ComparadorPorNombre implements Comparator<Persona> {
    public int compare(Persona a, Persona b) {
        return a.nombre.compareTo(b.nombre);
    }
}

// Búsqueda genérica
class Buscador {
    public static <T> boolean contiene(List<T> lista, T valor) {
        return lista.contains(valor);
    }
}

// Interfaz genérica
interface Repositorio<T> {
    void agregar(T t);
    T obtener(int index);
}

// Implementación simple
class ListaRepositorio<T> implements Repositorio<T> {
    List<T> datos = new ArrayList<>();

    public void agregar(T t) {
        datos.add(t);
    }

    public T obtener(int index) {
        return datos.get(index);
    }
}

// Main para probar todo
public class Main {
    public static void main(String[] args) {
        // Caja genérica
        Caja<String> caja = new Caja<>();
        caja.guardar("Hola");
        System.out.println("Caja: " + caja.obtener());

        // Lista de personas
        List<Persona> personas = Arrays.asList(
                new Persona("Ana", 28),
                new Persona("Luis", 21),
                new Persona("Pedro", 35)
        );

        // Ordenar por edad (Comparable)
        Collections.sort(personas);
        System.out.println("Por edad: " + personas);

        // Ordenar por nombre (Comparator)
        personas.sort(new ComparadorPorNombre());
        System.out.println("Por nombre: " + personas);

        // Buscar
        List<String> nombres = Arrays.asList("Ana", "Luis", "Pedro");
        System.out.println("¿Contiene 'Luis'? " + Buscador.contiene(nombres, "Luis"));

        // Repositorio
        Repositorio<String> repo = new ListaRepositorio<>();
        repo.agregar("Valor 1");
        System.out.println("Desde repo: " + repo.obtener(0));
    }
}
