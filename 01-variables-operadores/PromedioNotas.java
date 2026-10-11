import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int aprobados = 0;
        int reprobados = 0;
        System.out.println("Cuantos estudiantes vas a registrar: ");
        int cantidadEstudiantes = scanner.nextInt();
        while (cantidadEstudiantes <= 0){
            System.out.println("Ingrese un valor mayor a 0");

            System.out.println("Cuantos estudiantes vas a registrar: ");
            cantidadEstudiantes = scanner.nextInt();


        }

        for (int numero = 1;numero <=  cantidadEstudiantes  ;numero++ ){
            System.out.println("Ingrese la nota del estudiante " +numero);
            double nota = scanner.nextDouble();
            while (nota < 0 || nota >5){
                System.out.println("Valor no permitido");

                System.out.println("Ingrese un valor en el rango entre 0 y 5");
                nota =scanner.nextDouble();
            }
            if (nota >=3){
                aprobados++;
            }else {
                reprobados++;
            }

            sumaNotas+=nota;

        }
        System.out.println("El promedio de los estudiantes es: " + sumaNotas / cantidadEstudiantes);
        System.out.println("La cantidad de aprobados es: "+ aprobados);
        System.out.println("La cantidad de reprobados es " + reprobados);
        scanner.close();

    }

}
