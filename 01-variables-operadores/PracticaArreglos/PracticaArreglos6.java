package PracticaArreglos;

public class PracticaArreglos6 {
    public static void main(String [] args ){
        int[] valores = {12, 7, 20, 4, 9};
        int mayor = valores[0];
        int menor = valores[0];

        for (int i =1 ; i < valores.length ; i++){
            if (valores[i] > mayor) {
                mayor = valores[i];

            } else if (valores[i] < menor) {
                menor = valores[i];

            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: "+ menor);
    }
}
