import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println(" Bienvenido!");

        System.out.printf("¿Cuántos productos deseas ingresar? ");
        int cantidad = SC.nextInt();

        Producto[] productos = new Producto[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("\n--------- Producto " + (i + 1) + "--------\n");
            System.out.printf("Ingrese el nombre del producto: ");
            String nombre = SC.next();
            System.out.printf("Ingrese el precio del producto: ");
            double precio = SC.nextDouble();
            System.out.printf("Ingrese la cantidad del producto: ");
            int cant_total = SC.nextInt();
            System.out.printf("¿Su producto tiene descuento? (si/no): ");
            String opc = SC.next();

            if (opc.equals("si")) {
                System.out.printf("Ingrese el descuento del producto: ");
                double descuento = SC.nextDouble();
            }

            productos[i] = new Producto(nombre, precio, cant_total);
        }
    }
}