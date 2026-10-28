package Ejercicio2;

public class Motor {
    int caballos;
    boolean encendido = false;

    public Motor(int caballos) {
        this.caballos = caballos;
    }


    public void arrancar() {
        encendido = true;
        System.out.println("El motor ha arrancado");
    }


    public void apagar(){
        encendido = false;
        System.out.println("El motor se ha apagado");
    }
}
