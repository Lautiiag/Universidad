public class Main {

    public static void main(String[] args) {

        Auto auto1 = new Auto("Chevrolet", "negro");
        Auto auto2= new Auto("BMW", "negro", "JPA 431");

        System.out.println(auto2.color);
        System.out.println(auto2.patente);
        System.out.println(auto2.marca);

    }
}
