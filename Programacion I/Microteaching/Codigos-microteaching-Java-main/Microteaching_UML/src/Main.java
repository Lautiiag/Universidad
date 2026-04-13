public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro();
        perro1.asignarNombre("Firulais");
        System.out.println(perro1.getName());
        perro1.comer();
        perro1.ladrar();

        Gato gato1 = new Gato();
        gato1.asignarNombre("Chicho");
        System.out.println(gato1.getName());
        gato1.maullar();

        Loro loro1 = new Loro();
        loro1.asignarNombre("Cata");
        System.out.println(loro1.getName());
        loro1.hablar();
    }


}




