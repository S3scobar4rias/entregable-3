/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_figurasgeo;

/**
 *
 * @author santi
 */
public class Cuadrado {
    private int lado; // Atributo que define el lado de un cuadrado

    /**
     * Constructor de la clase Cuadrado
     * @param lado Parámetro que define la longitud de un lado de un cuadrado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el área de un cuadrado como el
     * lado elevado al cuadrado
     * @return Área de un Cuadrado
     */
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Método que calcula y devuelve el perímetro de un cuadrado como
     * cuatro veces su lado
     * @return Perímetro de un cuadrado
     */
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
