public class Producto {
    private String nombre;
    private double precio;
    private int cant_prod;
    private double descuento;

    public Producto(String nombre, double precio, int cant_prod) {
        this.nombre = nombre;
        this.precio = precio;
        this.cant_prod = cant_prod; //productos
    }

    public Producto(double descuento) {
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        descuento = precio * (descuento / 100) * cant_prod;
        System.out.println("El descuento del producto: " + descuento);
        return descuento;
    }
}
