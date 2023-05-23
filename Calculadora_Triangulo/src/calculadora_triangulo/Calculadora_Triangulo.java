/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_triangulo;

/**
 *
 * @author santi
 */
public class Calculadora_Triangulo {
    private double lado;
    private double perimetro;
    private double altura;
    private double area;

    public Calculadora_Triangulo(double lado) {
        this.lado = lado;
    }

    public void calcular() {
        perimetro = 3 * lado;
        altura = (Math.sqrt(3) / 2) * lado;
        area = (Math.sqrt(3) / 4) * lado * lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public double getArea() {
        return area;
    }
}
