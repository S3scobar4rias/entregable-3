/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_raiz;

/**
 *
 * @author santi
 */
public class Calculadora_raiz {
    private int number;

    public Calculadora_raiz(int number) {
        this.number = number;
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número ingresado: ").append(number).append("\n");
        sb.append("Raíz cuadrada: ").append(Math.sqrt(number)).append("\n");
        sb.append("Cuadrado: ").append(number * number).append("\n");
        sb.append("Cubo: ").append(number * number * number);
        return sb.toString();
    }
}

