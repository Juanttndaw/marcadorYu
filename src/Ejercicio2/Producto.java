package Ejercicio2;

public class Producto {
    private String nombre;
    private double precio;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void aplicarDescuento(double porcentaje) {
        double descuento = (precio * porcentaje) / 100;
        precio -= descuento;

    }
}
