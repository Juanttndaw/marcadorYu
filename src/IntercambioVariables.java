import java.util.Scanner;

public class IntercambioVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura: ");
        int temperatura  = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduce el mes: ");
        String mes = sc.nextLine();
        System.out.print("Introduce el dia: ");
        int dia = sc.nextInt();


        System.out.println("El " + dia + " de " + mes + " hace una temperatura de " + temperatura + " grados ");






















    }
}
