import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Dime otro numero: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Dime un simbolo como estos: (+,-,*,/): ");
        String sim = sc.nextLine();

        switch (sim){
            case "+":
                System.out.println("Este es el resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Este es el resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Este es el resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0){
                    System.out.println("Este es el resultado: " + (num1 / num2));
                }else {
                    System.out.println("No esta bien");
                }
                break;
            default:
                break;
        }
        sc.close();







    }


}
