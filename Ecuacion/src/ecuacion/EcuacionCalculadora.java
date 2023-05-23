/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecuacion;

/**
 *
 * @author santi
 */
public class EcuacionCalculadora {
    public String calcularSoluciones(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones de la ecuación son: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "La solución de la ecuación es: x = " + x;
        } else {
            return "No existen soluciones reales para la ecuación.";
        }
    }
}
