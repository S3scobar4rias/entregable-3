/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_figurasgeo;

/**
 *
 * @author santi
 */
public class Rombo {
    private double lado; // Atributo que define la longitud de un lado del rombo
    private double diagonalMayor; // Atributo que define la longitud de la diagonal mayor del rombo
    private double diagonalMenor; // Atributo que define la longitud de la diagonal menor del rombo
    
    /**
     * Constructor de la clase Rombo
     * @param lado Longitud de un lado del rombo
     * @param diagonalMayor Longitud de la diagonal mayor del rombo
     * @param diagonalMenor Longitud de la diagonal menor del rombo
     */
    public Rombo(double lado, double diagonalMayor, double diagonalMenor) {
        this.lado = lado;
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }
    
    /**
     * Método que calcula y devuelve el área del rombo
     * @return Área del rombo
     */
    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2;
    }
    
    /**
     * Método que calcula y devuelve el perímetro del rombo
     * @return Perímetro del rombo
     */
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
