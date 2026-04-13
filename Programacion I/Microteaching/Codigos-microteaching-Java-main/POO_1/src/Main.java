public class Main {
    public static void main(String[] args) {
        //creamos el objeto
        Producto producto1 = new Producto("Celulares",222,205.000);
        producto1.MostrarInfo();

        System.out.println("");
        //realizar venta
        producto1.vender(50);
        producto1.MostrarInfo();

        //cambiar precio y stock
        producto1.setPrecio(202.000);
        producto1.setStock(500);
        producto1.MostrarInfo();
    }
}