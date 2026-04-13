enum Dia{
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
}

public class Main {
    public static void main(String[] args) {

        Dia hoy = Dia.LUNES;

        switch(hoy){
            case LUNES -> System.out.println("Hoy es lunes,arranca la semana");
            case VIERNES -> System.out.println("Hoy es viernes,arranca el fin de semana");
            case SABADO,DOMINGO -> System.out.println("Hoy es fin de semana");
            default ->  System.out.println("Hoy es un día entre semana");
        }
    }
}