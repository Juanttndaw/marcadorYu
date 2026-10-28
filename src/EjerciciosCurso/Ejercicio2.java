package EjerciciosCurso;

import java.util.Scanner;
//Juan Antonio Torregrosa Macia _ 16-10-2026
// El programa es para saber si accedes a un parque de atracciones con la edad y altura

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // pido un boolean para luego en el bucle salir de el
        boolean S = false;

        while (!S){

            System.out.println("Dime tu edad: ");
            int edad = sc.nextInt();
            System.out.println("Dime tu altura: ");
            int altura = sc.nextInt();

            if (edad >= 12 && altura >= 140){
                //if para saber si superas o tienes igual que 12 de edad y altura de 140
                System.out.println("Acceso permitido");
            } else if (edad == 11 && altura >= 150 || edad == 10 && altura >= 150) {
                //if para saber si  tienes igual que 11 y 10 de edad y altura superior y igual a 150 altura
                System.out.println("Acceso permitido con acompañante");
            }else {
                //else para si no tienes la edades permitidas
                System.out.println("Acceso denegado");
            }

            //para que salga el String botton resetea el Scanner
            sc.nextLine();

            System.out.println("Desea realizar otra comprobación (S o N)");
            String botton = sc.nextLine();
            //pido si seguir el bucle o no

            //Para identificar lo que selecciono, también he puesto en minuscula por si se equivoca a seleccionarlo
            switch (botton){
                case "S":
                    break;
                case "s":
                    break;
                case "N":
                    S = true;
                    break;
                case "n":
                    S = true;
                    break;
                default:
                    System.out.println("Letra no valida");
                    break;
            }


        }


        sc.close();

    }


}
