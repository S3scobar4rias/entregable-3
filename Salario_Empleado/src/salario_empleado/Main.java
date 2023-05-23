/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salario_empleado;

/**
 *
 * @author santi
 */
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SalarioEmpleado interfaz = new SalarioEmpleado();
                SalarioEmpleadoController controller = new SalarioEmpleadoController(interfaz);
                interfaz.setVisible(true);
            }
        });
    }
}
