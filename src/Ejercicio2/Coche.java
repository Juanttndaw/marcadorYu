package Ejercicio2;

public class Coche {
    String marca;
    Motor motor;


    public Coche(String marca) {
        this.marca = marca;
        this.motor = new Motor(110);

    }


    public void arrancarCoche(){
        motor.arrancar();
    }
    public void apagarCoche(){
        motor.apagar();
    }





}
