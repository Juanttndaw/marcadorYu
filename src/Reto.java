import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Dime un numero para (a): ");
        double a = sc.nextDouble();
        System.out.print("Dime un numero para (b): ");
        double b = sc.nextDouble();
        System.out.print("Dime un numero para (c): ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Este es el resultado: " + area);





    }
}
