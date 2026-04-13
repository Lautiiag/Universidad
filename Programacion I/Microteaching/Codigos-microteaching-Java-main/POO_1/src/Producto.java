public class Producto {
    private String nombre;
    private int stock;
    private double precio;

    //constructor de producto
    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;

    }
    //mostrar info
    public void MostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Stock: "+stock);
        System.out.println("Precio: "+precio);
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    //ver setters

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //se puede vender?
    public void vender(int cantidad) {
        if(cantidad <= stock){
            stock -= cantidad;
            System.out.println("Se vendieron "+ cantidad + " unidades");
        }else{
            System.out.println("No hay suficientes unidades, quedan"+ cantidad + " en stock");
        }
    }
}
