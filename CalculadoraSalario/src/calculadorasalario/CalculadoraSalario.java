/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasalario;

/**
 *
 * @author santi
 */
public class CalculadoraSalario {
    public double calcularSalarioBruto(int horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto(int horasTrabajadas, double valorHora, double retencion) {
        double salarioBruto = calcularSalarioBruto(horasTrabajadas, valorHora);
        double retencionF = salarioBruto * (retencion / 100);
        return salarioBruto - retencionF;
    }
}
