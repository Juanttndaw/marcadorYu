package EjercicioDeVideos;

import java.util.Scanner;

public class EjercicioBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alumno;
        double nota, suma = 0;
        double maxima = Integer.MIN_VALUE;
        double minima = Integer.MAX_VALUE;

        System.out.println("Nota media, maximo y minimo de una clase");
        System.out.println("--------------------------------------");

        do {
            System.out.println("Introduceme el numero de Alumnos: ");
            alumno = sc.nextInt();

        }while (alumno <= 0);

        for (int i = 1; i <= alumno; i++) {
            do {
                System.out.println("Introduce la nota del alumno " + i + ": ");
                nota = sc.nextDouble();
            }while (nota < 0 || nota > 10);


            suma = suma + nota;


            if (nota > maxima){
                maxima =  nota;
            }

            if (nota < minima) {
                minima =  nota;
            }

        }

        double media = (double) suma / alumno;


        //Mostrar resultados
        System.out.println("Nota media: " + media);
        System.out.println("La maxima nota ha sido un " + maxima);
        System.out.println("La minima nota ha sido un " + minima);







    }
}
