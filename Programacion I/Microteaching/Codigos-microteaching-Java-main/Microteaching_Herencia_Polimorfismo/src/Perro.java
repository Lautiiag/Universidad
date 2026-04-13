// Subclase (Herencia simple)
class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre); // Llama al constructor de la superclase
        this.raza = raza;
    }

    @Override // Sobrescritura (polimorfismo por herencia)
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " mueve la cola. Es un " + raza);
    }
}
