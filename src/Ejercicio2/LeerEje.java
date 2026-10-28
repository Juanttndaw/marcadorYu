package Ejercicio2;

import java.util.Scanner;

public class LeerEje {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var tem1 = new Termostato();
        var des1 = new Producto("Portatil", 100);
        var co1 = new Coche("Seat");
        Producto[] pro1 = new Producto[4];

        pro1[0] = new Producto("usb", 15);
        pro1[1] = new Producto("Monitor", 120);
        pro1[2] = new Producto("ssd", 45.5);
        pro1[3] = new Producto("rtx 5060 8gb", 200);




        System.out.println("Temperatura inicial: " + tem1.temperatura);

        tem1.subirTemperatura();
        tem1.subirTemperatura();

        System.out.println("Temperatura Final: " + tem1.temperatura);
        des1.aplicarDescuento(10);
        System.out.println(des1.getPrecio());
        co1.arrancarCoche();
        co1.apagarCoche();

        //Ejercicio 4
        Double precioMayor = pro1[0].getPrecio();
        String productoMasCaro = pro1[0].getNombre();

        for (int i = 0; i < pro1.length; i++) {


            if (pro1[i].getPrecio() > precioMayor){
                precioMayor = pro1[i].getPrecio();
                productoMasCaro = pro1[i].getNombre();

            }




        }
        System.out.println("El producto más caro es: " + productoMasCaro + " con un precio de " + precioMayor);

        //ejercicio 5

        // 1. Crear batería al 80%
        Bateria miBateria = new Bateria(80, "Samsung");
        System.out.println("Carga inicial: " + miBateria.getNivelCarga() + "%");

        // 2. Intentar cargar un 30% (80 + 30 = 110 -> debe quedarse en 100)
        miBateria.cargar(30);
        System.out.println("Tras cargar 30%: " + miBateria.getNivelCarga() + "%");

        // 3. Intentar usar un 120% (100 - 120 = -20 -> debe quedarse en 0 y mostrar mensaje)
        miBateria.usar(120);
        System.out.println("Tras usar 120%: " + miBateria.getNivelCarga() + "%");



    }
}
