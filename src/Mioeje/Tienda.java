package Mioeje;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productos = 0;
        double precio;
        double cantidad;
        double total_productos;
        double importeTotal;
        double maxima = Integer.MIN_VALUE;
        double minima = Integer.MAX_VALUE;

        System.out.println("tienda quiere conocer los resultados de sus ventas del día.");
        System.out.println("--------------------------------------");


        do {
            System.out.println("Dime cuántos productos diferentes se han vendido: ");
            productos = sc.nextInt();
        }while (productos <= 0);


        System.out.println("Dime el precio: ");
        precio = sc.nextDouble();
        System.out.println("Dime las ventas: ");
        cantidad = sc.nextDouble();









        System.out.println("El producto: " + productos);
        System.out.println("La cantidad: " + cantidad);
        System.out.println("El precio del producto max: " + maxima);
        System.out.println("El precio del producto min: " + minima);










    }
}
