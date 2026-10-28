package Tema2;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime los LP (Life Points) J1: ");
        int lp1 = sc.nextInt();
        System.out.print("Dime los LP (Life Points) J2: ");
        int lp2 = sc.nextInt();
        System.out.print("Dime el Ataque de un monstruo: ");
        int atk = sc.nextInt();


        if (atk > lp2){
            System.out.println("Ganador jugador 1: " + (lp2 - atk));
        } else if (atk < lp2) {
            int atkfin = lp2 - atk;
            if (atkfin <= 1000){
                System.out.println("¡Peligro! " + atkfin);
            }
            System.out.println("El jugador 2 sobrevive: " + atkfin);
        }else if (atk == lp2){
            //¿Gana el jugador 1 o sobrevive con 0?
            System.out.println("Gana el jugador 1: " + (lp2 - atk));
        }


    }
}
