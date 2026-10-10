import java.util.Scanner;

public class CompraInteractiva {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto;");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el porcentaje de descuento; ");
        double porcentajeDescuento = scanner.nextDouble();

        double subtotal = cantidad * precioUnitario;
        double descuento = subtotal * porcentajeDescuento/100;
        double total = subtotal - descuento;
        System.out.println(nombreProducto);
        System.out.println(precioUnitario);
        System.out.println(cantidad);
        System.out.println(descuento);
        System.out.println(subtotal);
        System.out.println(total);


    }
}
