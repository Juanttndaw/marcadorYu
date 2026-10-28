import java.util.Scanner;

public class excepciones {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);


        try {

            System.out.print("Dime un numero: ");
            String num = sc.nextLine();
            int numpos = Integer.parseInt(num);

            System.out.println("Este es tu numero en texto: " + numpos);


        } catch (NumberFormatException e) {
            System.out.println("Eso no es un número válido");
        }finally {
            sc.close();
        }





    }
}
