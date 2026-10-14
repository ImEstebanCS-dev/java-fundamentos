import java.util.Scanner;

public class NotasConMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int aprobados = 0;
        int reprobados = 0;
        System.out.println("Cuantos estudiantes vas a registrar: ");
        int cantidadEstudiantes = scanner.nextInt();
        while (cantidadEstudiantes <= 0) {
            System.out.println("Ingrese un valor mayor a 0");

            System.out.println("Cuantos estudiantes vas a registrar: ");
            cantidadEstudiantes = scanner.nextInt();


        }

        for (int numero = 1; numero <= cantidadEstudiantes; numero++) {
            System.out.println("Ingrese la nota del estudiante " + numero);
            double nota = scanner.nextDouble();
            while (!esNotaValida(nota)) {
                System.out.println("Valor no permitido");

                System.out.println("Ingrese un valor en el rango entre 0 y 5");
                nota = scanner.nextDouble();
            }
            if (estaAprobado(nota)) {
                aprobados++;
            } else {
                reprobados++;
            }

            sumaNotas += nota;

        }
        System.out.println("El promedio de los estudiantes es: " + calcularPromedio(sumaNotas, cantidadEstudiantes));

        scanner.close();

    }
    public static boolean esNotaValida(double nota) {
        return nota >= 0 && nota <= 5;

    }
    public static boolean estaAprobado(double nota){
        return nota >=3;
    }
    public static double calcularPromedio(double sumaNotas, int cantidadEstudiantes){
        return sumaNotas / cantidadEstudiantes;

    }
}
