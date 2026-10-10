public class Compra {
    public static void main(String[] args){
        String nombre= "cuaderno";
        double precioUnitario=8500;
        int cantidadComprada=3;
        double porcentajeDescuento=10;

        double subtotal = precioUnitario * cantidadComprada;
        double valorDescuento = subtotal * porcentajeDescuento/100;
        double totalPago= subtotal - valorDescuento;

    System.out.println("El producto;"+  nombre + " Su precio unitario;"+ precioUnitario+ " La cantidad;"+ cantidadComprada+" El subtotal;" +subtotal+" Su descuento;"+ porcentajeDescuento+" y su total;"+totalPago);





    }
}
