package Ejerciciostem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E2catorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        try {
            int nota;

            System.out.print("Dime tu nota del 0 a 10: ");
            nota = sc.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar comprendida entre 0 y 10");
            } else if (nota <= 4) {
                System.out.println("Suspenso: " + nota);
            } else if (nota <= 6) {
                System.out.println("Aprobado: " + nota);
            } else if (nota <= 8) {
                System.out.println("Notable: " + nota);
            } else {
                System.out.println("Sobresaliente: " + nota);
            }

        }catch (InputMismatchException e){
            System.out.println("Error has puesto decimales");
        }


    }
}
