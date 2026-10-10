import java.util.Scanner;

public class CompraValidada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre del producto:");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingresa el precio unitario:");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Ingresa la cantidad:");
        int cantidad = scanner.nextInt();

        System.out.println("Ingresa el porcentaje de descuento:");
        double porcentajeDescuento = scanner.nextDouble();

        if (precioUnitario <= 0 ){
            System.out.println("El precio debe ser mayor a 0");
        } else if (cantidad < 0) {
            System.out.println("La cantidad debe ser mayor a 0");
        } else if (porcentajeDescuento <0 || porcentajeDescuento >100) {
            System.out.println("El porcentaje debe estar entre 0 y 100");
        }else {
            double subtotal = cantidad * precioUnitario;
            double descuento = subtotal * porcentajeDescuento/100;
            double total = subtotal - descuento;
            System.out.println("Nombre del producto: " + nombreProducto);
            System.out.println("Precio unitario:" + precioUnitario);
            System.out.println("Cantidad:" + cantidad);
            System.out.println("Descuento:" + descuento);
            System.out.println("Subtotal:" + subtotal);
            System.out.println("Total:" + total);

        }

    }
}
