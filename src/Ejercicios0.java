import java.util.Scanner;

public class Ejercicios0 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //1
        int edad = 25;
        System.out.println("Tengo " + edad + " años");
        //2
        double precio = 19.99;
        System.out.println("El precio es: " + precio);
        //3
        int Nota = 8;
        System.out.println("Tu nota es: " + Nota);
        //4
        System.out.print("Dime tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        //5
        double a = 7;
        double b = 2;
        double resultado = a / b;
        System.out.println("El resultado es: " + resultado);
        //6
        System.out.println("Dime tu edad: ");
        int edad3 = sc.nextInt();
        System.out.println("Edad: " + edad3);
        //7
        int num1 = 5;
        int num2 = 10;
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        //8
        System.out.print("Introduce tu edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce tu nombre: ");
        String nombre2 = sc.nextLine();
        System.out.println("Hola " + nombre2 + ", tienes " + edad1 + " años");
        //9
        double lado = 5;
        double area = lado * lado;
        double raizDeAlgo = Math.sqrt(16);
        System.out.println("Área: " + area);
        System.out.println("Raíz: " + raizDeAlgo);
        //10
        double base = 4.0;
        double altura = 6.0;
        double area2 = base * altura / 2;
        System.out.println("El área del triángulo es: " + area2);



    }
}
