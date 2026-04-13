
// Clase principal
public class Main {
    public static void main(String[] args) {

        // Upcasting: tratamos un Perro como un Animal
        Animal miAnimal = new Perro("Toby", "Labrador");
        miAnimal.saludar();
        miAnimal.hacerSonido(); // Polimorfismo: se ejecuta el método de Perro

        // instanceof + downcasting seguro
        if (miAnimal instanceof Perro) {
            Perro miPerro = (Perro) miAnimal; // Downcasting
            miPerro.moverCola(); // Método específico de Perro
        }

        // Otro ejemplo de polimorfismo
        Animal otroAnimal = new Gato("Michi");
        otroAnimal.hacerSonido(); // Se ejecuta el método de Gato

        // Polimorfismo con arreglo
        Animal[] animales = {new Perro("Max", "Beagle"), new Gato("Luna")};
        for (Animal a : animales) {
            a.hacerSonido(); // Cada uno hace su propio sonido
        }
    }
}
