# Introducción a la Programación Orientada a Objetos en Java

## 🧠 Actividad 1 - Objetos y Clases en Java

Este repositorio contiene una serie de ejercicios prácticos desarrollados en Java utilizando NetBeans, como parte de una actividad introductoria a la Programación Orientada a Objetos (POO). Los ejercicios están diseñados para poner en práctica conceptos clave como:

- Creación de clases
- Instanciación de objetos
- Atributos y métodos
- Encapsulamiento
- Modularización del código

---

## 📂 Contenido del Repositorio

### 📹 VIDEO 1:  
### 💼 Cálculo del sueldo de un vendedor

Este mini proyecto calcula el sueldo mensual de un vendedor, combinando un sueldo fijo con una comisión del 16% sobre las ventas realizadas.

#### 🧩 Clases involucradas:

- `Vendedor`: contiene los atributos y el método para calcular el sueldo.
- `mainVendedor`: gestiona la entrada de datos y muestra el resultado.

#### 🧮 Lógica:
```java
public class Vendedor {
    private static double COMISION = 0.16;
    private static double SUELDO_FIJO = 14000;
    private double valorUnitario;
    private int cantVendida;

    public Vendedor(double valorUnitario, int cantVendida){
        this.valorUnitario = valorUnitario;
        this.cantVendida = cantVendida;
    }

    public double obtenerSueldo(){
        return SUELDO_FIJO + (cantVendida * valorUnitario * COMISION);
    }
}
```

```java
public class mainVendedor {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("¿Cuánto vale cada artículo?");
        double valorUnitario = input.nextDouble();

        System.out.println("¿Cuántos artículos se vendieron en el mes?");
        int cantVendida = input.nextInt();

        Vendedor v = new Vendedor(valorUnitario, cantVendida);
        System.out.println("Sueldo total: $" + v.obtenerSueldo());
    }
}
```

---

### 📹 VIDEOS 2, 3 y 5:  
### 🚗 Simulación de un auto

Este ejercicio simula el comportamiento básico de un auto utilizando una clase personalizada. Refuerza los conceptos de atributos privados, métodos públicos y control de estado interno del objeto.

#### 🧩 Clases involucradas:

- `Auto`: representa el objeto auto con su estado y comportamiento.
- `mainAuto`: instancia un objeto Auto y prueba sus métodos.

#### ⚙️ Funcionalidades:

- Encender y apagar el auto
- Acelerar (sólo si está encendido)
- Frenar
- Cambiar de color
- Mostrar información del auto

#### 🔧 Código:
```java
public class Auto {
    private String patente;
    private String marca;
    private String color;
    private int km;
    private boolean encendido;

    public Auto(String patente, String marca, String color, int km) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.km = km;
        this.encendido = false;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El auto se ha encendido.");
        } else {
            System.out.println("El auto ya está encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El auto se ha apagado.");
        } else {
            System.out.println("El auto ya está apagado.");
        }
    }

    public void acelerar(int cantidad) {
        if (encendido) {
            km += cantidad;
            System.out.println("El auto ha acelerado. Kilometraje actual: " + km + " km");
        } else {
            System.out.println("El auto está apagado, no puede acelerar.");
        }
    }

    public void frenar() {
        if (encendido) {
            System.out.println("El auto ha frenado.");
        } else {
            System.out.println("El auto está apagado, no puede frenar.");
        }
    }

    public void cambiarDeColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El color del auto ha cambiado a: " + color);
    }

    public void mostrarInformacion() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Kilometraje: " + km + " km");
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }
}
```

```java
public class mainAuto {
    public static void main(String[] args) {
        Auto miAuto = new Auto("ABC123", "Toyota", "Rojo", 10000);

        miAuto.mostrarInformacion();
        miAuto.encender();
        miAuto.acelerar(50);
        miAuto.cambiarDeColor("Azul");
        miAuto.frenar();
        miAuto.apagar();

        System.out.println("\nInformación actualizada:");
        miAuto.mostrarInformacion();
    }
}
```

---

### 📹 VIDEO 4:  
### 🔢 Cálculo de factorial con clase `Calculadora`

Este programa realiza el cálculo del factorial de un número ingresado por el usuario. Si se introduce un número negativo, se lanza una excepción.

#### 🧩 Clases involucradas:

- `Calculadora`: contiene el método `factorial(int num)`
- `Test6`: permite ingresar el número y muestra el resultado

#### ✍️ Código:
```java
public class Calculadora {
    public int factorial(int num) {
        if (num < 0) {
            throw new RuntimeException("No se puede calcular el factorial de un número menor a 0");
        }

        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
```

```java
public class Test6 {
    public static void main(String[] args) {
        System.out.print("Ingrese y: ");
        int y = new Scanner(System.in).nextInt();

        int z = new Calculadora().factorial(y);
        System.out.println("Resultado: " + z);
        System.out.println("Adiós!");
    }
}
```

---

## 🔧 Requisitos

- Java JDK 17 o superior  
- NetBeans IDE  
- Conocimiento básico de Programación Orientada a Objetos

---

## 📦 ¿Cómo usar este repositorio?

1. Cloná o descargá este repositorio.
2. Abrí NetBeans y seleccioná `File > Open Project`.
3. Ejecutá cada clase `main` según el proyecto que quieras probar.
4. Ingresá los valores solicitados por consola y observá el resultado.

---

## 📚 Aprendizajes Clave

- Uso de clases y objetos en Java
- Encapsulamiento de atributos
- Métodos con retorno y sin retorno
- Entrada de datos con `Scanner`
- Control de flujo mediante condiciones y excepciones
