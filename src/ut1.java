import java.util.Scanner;

public class ut1 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);


        System.out.print("Dime la base: ");
        double base = sc.nextDouble();
        System.out.print("Dime la altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;
        double perimetro = (base * 2) + (altura * 2);

        System.out.println("Esta es la Area: " + area + " Esto es el perimetro: " + perimetro);



    }
}
