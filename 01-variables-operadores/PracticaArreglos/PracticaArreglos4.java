package PracticaArreglos;

public class PracticaArreglos4 {
    public static void main(String [] args){
        int mayoresQueDiez = 0;
        int menoresQueDiez = 0;
        int[] valores = {12, 7, 20, 4, 9};
        for (int i = 0 ; i < valores.length ; i++){
            int valor = valores[i];
            if (valor > 10){
                menoresQueDiez++;
            }else{
                menoresQueDiez++;
            }
        }
        System.out.println("Mayores que 10: "+ mayoresQueDiez);
        System.out.println("Menores que 10: "+ menoresQueDiez);
    }
}
