package Mioeje;

import java.util.Scanner;

public class EjeFoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String num2;
        int TotalCon = 0;

        final int MIN_FILAS = 1;
        final int MAX_FILAS = 7;
        final int MIN_LONG = 1;
        final int MAX_LONG = 10;

        System.out.println("Ejercicio examen Foto");
        System.out.println("--------------------------------------");

        do {
            System.out.print("Escribe un numero entre 1 a 7: ");
            num = sc.nextInt();

        }while (num < 1 || num > 7);

        sc.nextLine();


        do {
            System.out.print("Escribe una cadena de texto de 1 a 10: ");
            num2 = sc.nextLine();

            if (num2.isEmpty()) {
                System.out.println("ERROR: La cadena no puede estar vacía.");
            } else if (num2.length() < MIN_LONG || num2.length() > MAX_LONG){
                System.out.println("ERROR: La longitud debe estar entre 1 y 10.");
            }


        }while (num2.length() < 1 || num2.length() > 10);

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0){
                num2 = num2.toLowerCase();
            }else {
                num2 = num2.toUpperCase();
            }

            // Aquí construiremos cada fila
            for (int j = 0; j < i; j++) {
                System.out.print(num2);
                if (j < i -1){
                    if (i % 2 == 0){
                        System.out.print("+");
                        TotalCon++;
                    }else {
                        System.out.print("-");
                        TotalCon++;
                    }
                }
                TotalCon += num2.length();
            }

            System.out.println();
        }



        System.out.println("--------------------------------------");
        System.out.println("Total de caracteres escritos: " + TotalCon);






    }
}
