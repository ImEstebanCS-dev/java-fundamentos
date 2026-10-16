package PracticaArreglos;

public class PracticaArreglos3 {
    public static void main(String [] args){
        int[] valores = {12, 7, 20, 4, 9};
        double acumulador = 0;

        for (int i = 0 ; i < valores.length ; i++){
            acumulador += valores[i];
        }
        double promedio = acumulador / valores.length;
        System.out.println("Suma: " + acumulador);
        System.out.println("Promedio: " + promedio);
    }
}
