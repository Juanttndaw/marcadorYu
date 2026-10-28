package Mioeje;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int dias;
        int temperatura;
        double maxima = Integer.MIN_VALUE;
        double minima = Integer.MAX_VALUE;
        int diasBajoCero = 0;




        System.out.println("temperatura media, máxima y mínima de varios días");
        System.out.println("--------------------------------------");

        do {
            System.out.println("cuántos días quieres registrar: ");
            dias = sc.nextInt();
        }while (dias <= 0);

        for (int i = 1; i <= dias ; i++) {
            do {
                System.out.println("Dime la temperatura del día " + i + ": ");
                temperatura = sc.nextInt();
            } while (temperatura < -20 || temperatura > 50);

            media = media / temperatura;

            if (temperatura < 0) {
                diasBajoCero++;
            }

            if (temperatura > maxima){
                maxima =  temperatura;
            }

            if (temperatura < minima) {
                minima =  temperatura;
            }

        }


        System.out.println("La media de temperatura: " + media);
        System.out.println("La maxima de temperatura: " + maxima);
        System.out.println("La minima de temperatura: " + minima);
        System.out.println("Dias bajo 0: " + diasBajoCero);



    }



}
