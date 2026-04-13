// Asociación unidireccional
class B {
    String name;
    B(String name) {
        this.name = name;
    }
}

class A {
    B b; // A conoce a B
    A(B b) {
        this.b = b;
    }
}

// Agregación
class D {
    int value;
    D(int value) {
        this.value = value;
    }
}

class C {
    D d; // C agrega a D, pero D puede existir sin C
    C(D d) {
        this.d = d;
    }
}

// Composición
class E {
    String data;
    E(String data) {
        this.data = data;
    }
}

class F {
    E e; // F compone E, crea y la contiene
    F(String data) {
        this.e = new E(data);
    }
}

// Asociación bidireccional
class G {
    H h;
    void setH(H h) {
        this.h = h;
        h.setG(this);
    }
}

class H {
    G g;
    void setG(G g) {
        this.g = g;
    }
}

// Clase principal para probar todo
public class Main {
    public static void main(String[] args) {
        // Asociación unidireccional
        B b = new B("Objeto B");
        A a = new A(b);

        // Agregación
        D d = new D(10);
        C c = new C(d);

        // Composición
        F f = new F("datos E");

        // Asociación bidireccional
        G g = new G();
        H h = new H();
        g.setH(h);

        // Mostrar resultados
        System.out.println("A -> B: " + a.b.name);
        System.out.println("C -> D: " + c.d.value);
        System.out.println("F -> E: " + f.e.data);
        System.out.println("G -> H: " + (g.h != null));
        System.out.println("H -> G: " + (h.g != null));
    }
}

