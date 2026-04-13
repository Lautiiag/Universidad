public class Animal {
    private String name;
    private int edad;
    private int id;
    private double peso;

    public void asignarNombre(String nuevoNombre) {
        name = nuevoNombre;
    }

    public void comer() {
        System.out.println("El animal esta comiendo.");
    }

    // Getters opcionales para acceso externo
    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    // Setters opcionales para inicializar
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

