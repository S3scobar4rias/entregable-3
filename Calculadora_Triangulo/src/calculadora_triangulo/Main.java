/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora_triangulo;

/**
 *
 * @author santi
 */
public class Main {
    public static void main(String[] args) {
        double lado = 5.0; // Lado del triángulo
        
        Calculadora_Triangulo calculadora = new Calculadora_Triangulo(lado);
        calculadora.calcular();
        
        double perimetro = calculadora.getPerimetro();
        double altura = calculadora.getAltura();
        double area = calculadora.getArea();
        
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
    }
}
