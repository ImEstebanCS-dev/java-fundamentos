package PracticaArreglos;

import java.util.Scanner;

public class PracticaArreglos5 {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        int[] valores = {12, 7, 20, 4, 9, 7};
        int posicionEncontrada = -1;


        System.out.println("Ingrese el numero que quiere buscar: ");
        int numeroBuscar = scanner.nextInt();
        for (int i = 0 ; i < valores.length ; i++){
            if (numeroBuscar == valores[i]){
                 posicionEncontrada = i;


                break;
            }
        }
        if (posicionEncontrada == -1){
            System.out.println("Posicion no encontrada");
        }else {
            System.out.println(posicionEncontrada);
        }
        scanner.close();
    }
}
