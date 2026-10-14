import java.util.Scanner;

public class RegistroNotas {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        double sumaNotas = 0;

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        cantidadEstudiantes = cantidadValida(cantidadEstudiantes);
        double[] notas = new double[cantidadEstudiantes];


        for (int numero = 0;numero < cantidadEstudiantes ; numero++){
            System.out.println("Ingrese la nota del estudiante: " + (numero + 1 ) );
            double nota = scanner.nextDouble();
            while (!esNotaValida(nota)) {
                System.out.println("Ingrese una nota entre 0 y 5:");
                nota = scanner.nextDouble();
            }

            notas[numero] = nota;


        }
        for (int i = 0 ; i < notas.length ; i++){
            sumaNotas += notas[i];
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);

        }

        double promedio = sumaNotas / notas.length;
        System.out.println(" El promedio es: " + promedio);
        double notaMayor = notas[0];
        double notaMenor = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }

            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
        }

        System.out.println("Nota más alta: " + notaMayor);
        System.out.println("Nota más baja: " + notaMenor);



        scanner.close();



    }

    public static int cantidadValida(int cantidadEstudiantes){
        while (cantidadEstudiantes <= 0 ){
            System.out.println("Ingrese un valor mayor a 0");

            cantidadEstudiantes = scanner.nextInt();


        }
        return cantidadEstudiantes;

    }
    public static boolean esNotaValida(double nota) {
        return nota >= 0 && nota <= 5;

    }



}
