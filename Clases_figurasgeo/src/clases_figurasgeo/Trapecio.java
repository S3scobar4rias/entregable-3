/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_figurasgeo;

/**
 *
 * @author santi
 */
public class Trapecio {
    private double baseMayor; // Atributo que define la longitud de la base mayor del trapecio
    private double baseMenor; // Atributo que define la longitud de la base menor del trapecio
    private double altura; // Atributo que define la altura del trapecio
    private double lado1; // Atributo que define la longitud de un lado del trapecio
    private double lado2; // Atributo que define la longitud del otro lado del trapecio
    
    /**
     * Constructor de la clase Trapecio
     * @param baseMayor Longitud de la base mayor del trapecio
     * @param baseMenor Longitud de la base menor del trapecio
     * @param altura Altura del trapecio
     * @param lado1 Longitud de un lado del trapecio
     * @param lado2 Longitud del otro lado del trapecio
     */
    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
     * Método que calcula y devuelve el área del trapecio
     * @return Área del trapecio
     */
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    
    /**
     * Método que calcula y devuelve el perímetro del trapecio
     * @return Perímetro del trapecio
     */
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}

