import java.util.Scanner;

public class CompraInteractiva {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el porcentaje de descuento: ");
        double porcentajeDescuento = scanner.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double descuento = subtotal * porcentajeDescuento/100;
        double total = subtotal - descuento;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio unitario:" + precioUnitario);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Descuento:" + descuento);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);

        scanner.close();


    }

}
