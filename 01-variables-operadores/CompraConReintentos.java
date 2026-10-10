import java.util.Scanner;

public class CompraConReintentos {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del producto");
        String nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio: ");
        double precio = scanner.nextDouble();
         while (precio <= 0){
             System.out.println("El precio debe ser mayor a 0");

             System.out.println("Ingrese el precio: ");
             precio = scanner.nextDouble();

         }

        System.out.println("Ingrese la cantidad: ");
         int cantidad = scanner.nextInt();
         while (cantidad <= 0){
             System.out.println("La cantidad debe ser mayor a 0");

             System.out.println("Ingrese la cantidad: ");
             cantidad = scanner.nextInt();

         }

        System.out.println("Ingrese el porcentaje de descuento: ");
         double porcentajeDescuento = scanner.nextDouble();

         while (porcentajeDescuento < 0 || porcentajeDescuento > 100){
             System.out.println("El porcentaje debe estar entre 0 y 100");

             System.out.println("Ingrese el porcentaje de descuento");
             porcentajeDescuento = scanner.nextDouble();
         }

        double subtotal = cantidad * precio;
        double descuento = subtotal * porcentajeDescuento/100;
        double total = subtotal - descuento;
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio unitario:" + precio);
        System.out.println("Cantidad:" + cantidad);
        System.out.println("Descuento:" + descuento);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Total:" + total);
        scanner.close();

    }
}
