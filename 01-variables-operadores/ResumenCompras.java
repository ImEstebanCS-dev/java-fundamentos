import java.util.Scanner;

public class ResumenCompras {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int opcion;
        int comprasTotales =0;
        int sumaCantidad =0;
        double descuentosTotales = 0;
        double totalAPagar = 0;

        do {




            System.out.println("Ingresa el nombre del producto: ");
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

            comprasTotales++;
            sumaCantidad+= cantidad;
            descuentosTotales += descuento;
            totalAPagar += total;




            System.out.println("Ingresa 1 para registrar otra compra o 0 para salir:");
            opcion = scanner.nextInt();

            while (opcion != 0 && opcion != 1) {
                System.out.println("Opción inválida. Ingresa 1 o 0:");
                opcion = scanner.nextInt();
            }

            scanner.nextLine();





        }while (opcion == 1);

        scanner.close();
        System.out.println("Compras registradas: " + comprasTotales);
        System.out.println("Unidades compradas: " + sumaCantidad);
        System.out.println("Descuentos totales: " + descuentosTotales);
        System.out.println("Total a pagar: " + totalAPagar);








    }

}
