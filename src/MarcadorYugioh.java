import java.util.Scanner;

public class MarcadorYugioh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int j1 = 8000;
        int j2 = 8000;

        boolean res = false;

        while (!res){
            System.out.println("jugador 1: " + j1 + " jugador 2: " + j2);


            System.out.println("Dime una opcion de estas: " + "\n" + "1: restar a jugador 1" + "\n"
                    + "2: restarle a jugador 2" + "\n" + "3: salir");
            int mar = sc.nextInt();


            switch (mar){
                case 1:

                    if (j1 > 0){
                        System.out.println("Dime cuantos LP quitas: ");
                        int quit1 = sc.nextInt();
                        j1 = j1 - quit1;

                        if (j1 < 0) {
                            j1 = 0;
                        }

                        if (j1 <= 0){
                            System.out.println("Perdistes jugador 1");
                            System.out.println("jugador 1: " + j1 + " jugador 2: " + j2);
                            res = true;
                        }

                    }
                    break;
                case 2:
                    if (j2 > 0){
                        System.out.println("Dime cuantos LP quitas: ");
                        int quit2 = sc.nextInt();
                        j2 = j2 - quit2;

                        if (j2 < 0) {
                            j2 = 0;
                        }


                        if (j2 <= 0){
                            System.out.println("Perdistes jugador 2");
                            System.out.println("jugador 1: " + j1 + " jugador 2: " + j2);
                            res = true;
                        }

                    }

                    break;
                case 3:
                    System.out.println("Estas saliendo de Marcadores");
                    res = true;
                    break;
                default:
                    System.out.println("No se puede error");
                    break;
            }



        }


    }
}
