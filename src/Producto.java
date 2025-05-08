public class Producto {
    private String nombre;
    private double precio;
    private int cant_prod;
    private double descuento;

    public Producto(String nombre, double precio, int cant_prod, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cant_prod = cant_prod; //productos
        this.descuento = descuento;
    }

    public double calcularDescuento() {
        double subtotal = precio * cant_prod;
        return subtotal - (subtotal * (descuento / 100));
    }

    public double calcularSubtotal() {
        return precio * cant_prod;
    }

    public double calcularTotal(Producto[] productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }
}

