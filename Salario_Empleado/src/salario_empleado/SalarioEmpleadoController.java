/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package salario_empleado;

/**
 *
 * @author santi
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SalarioEmpleadoController implements ActionListener {
    private SalarioEmpleado interfaz;

    public SalarioEmpleadoController(SalarioEmpleado interfaz) {
        this.interfaz = interfaz;

        interfaz.getCalcularButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == interfaz.getCalcularButton()) {
            String nombre = interfaz.getNombreField().getText();
            double salarioHora = Double.parseDouble(interfaz.getSalarioHoraField().getText());
            int horasTrabajadas = Integer.parseInt(interfaz.getHorasTrabajadasField().getText());

            double salarioMensual = salarioHora * horasTrabajadas;

            if (salarioMensual > 450000) {
                String mensaje = "Nombre: " + nombre + ", Salario Mensual: $" + salarioMensual;
                JOptionPane.showMessageDialog(interfaz, mensaje);
            } else {
                String mensaje = "Nombre: " + nombre;
                JOptionPane.showMessageDialog(interfaz, mensaje);
            }
        }
    }
}
