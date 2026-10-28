package Mioeje;

import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num;
        int pos = 0;
        int con_pos = 0;
        int con_neg = 0;
        int maximo = Integer.MIN_VALUE;


        System.out.println("Ejercicio 3. Análisis de una secuencia de números");
        System.out.println("--------------------------------------");


        do {
            System.out.print("Dime un numero (Para salir dime el numero 0): ");
            num = sc.nextInt();

            if (num > 0){
                System.out.println("Es positivo");
                pos = pos + num;
                con_pos++;
                contador++;

            }else if (num < 0){
                System.out.println("Es negativo");
                con_neg++;
                contador++;
            }

            if (num != 0 && num > maximo) {
                maximo = num;
            }

        }while (num != 0);

        if (contador == 0){
            System.out.println("No se ha introducido ningún número para analizar.");
        }else {
            System.out.println("Esta es la suma de los numeros positivos: " + pos);
            System.out.println("numeros positivos: " + con_pos);
            System.out.println("numeros negativos: " + con_neg);
            System.out.println("Las vueltas del bucle: " + contador);
            System.out.println("Numero maximo: " + maximo);
        }






    }
}
