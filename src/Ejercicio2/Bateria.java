package Ejercicio2;

public class Bateria {

    private int nivelCarga;
    private  String modelo;


    public Bateria(int nivelCarga, String modelo) {
        // Comprobamos los límites antes de asignar la carga inicial
        if (nivelCarga > 100) {
            this.nivelCarga = 100;
        } else if (nivelCarga < 0) {
            this.nivelCarga = 0;
        } else {
            this.nivelCarga = nivelCarga;
        }

        this.modelo = modelo;
    }

    public Bateria(int nivelCarga) {
        // Comprobamos los límites antes de asignar la carga inicial
        if (nivelCarga > 100) {
            this.nivelCarga = 100;
        } else if (nivelCarga < 0) {
            this.nivelCarga = 0;
        } else {
            this.nivelCarga = nivelCarga;
        }
    }


    public Bateria(String modelo){
        this.modelo = modelo;
    }

    // Métodoo
    //  para cargar
    //  protegiendo el tope de 100
    public void cargar(int cantidad) {
        this.nivelCarga += cantidad;

        // Si sobrepasa el 100%, lo ajustamos al tope
        if (this.nivelCarga > 100) {
            this.nivelCarga = 100;
        }
    }

    //Metodo
    // para consumir
    // protegiendo el límite de 0
    public void usar(int cantidad) {
        this.nivelCarga -= cantidad;

        // Si la carga baja de 0, la fijamos en 0 y avisamos
        if (this.nivelCarga <= 0) {
            this.nivelCarga = 0;
            System.out.println("Batería agotada");
        }
    }

    // Getter para poder consultar la carga desde el Main
    public int getNivelCarga() {
        return nivelCarga;
    }

    public String getModelo() {
        return modelo;
    }





}
