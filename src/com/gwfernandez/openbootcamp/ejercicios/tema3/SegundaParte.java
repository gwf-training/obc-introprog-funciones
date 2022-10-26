package com.gwfernandez.openbootcamp.ejercicios.tema3;

/**
 * Segunda parte:
 *
 * Crear una clase coche.
 * Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
 * Una función que incremente el número de puertas que tiene el coche.
 * Crear un objeto miCoche en el main y añadirle una puerta.
 * Mostrar el número de puertas que tiene el objeto.
 */
public class SegundaParte {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.addPuerta();
        coche.addPuerta();
        coche.addPuerta();
        coche.addPuerta();
        System.out.println("cantidad puertas: " + coche.getCantidadPuertas());
    }
}

