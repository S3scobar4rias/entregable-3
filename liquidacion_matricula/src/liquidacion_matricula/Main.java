/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liquidacion_matricula;

/**
 *
 * @author santi
 */
public class Main {
    public static void main(String[] args) {
        LiquidacionMatricula liquidacion = new LiquidacionMatricula();
        LiquidacionMatriculaController controller = new LiquidacionMatriculaController(liquidacion);
        liquidacion.setVisible(true);
    }
}
