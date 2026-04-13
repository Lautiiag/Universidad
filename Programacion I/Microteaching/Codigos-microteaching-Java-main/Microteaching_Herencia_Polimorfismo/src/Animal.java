// Clase abstracta base (Abstracción)
abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido(); // Método abstracto

    public void saludar() {
        System.out.println("Hola, soy un animal y me llamo " + nombre);
    }
}