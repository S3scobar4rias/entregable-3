/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package salario_empleado;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalarioEmpleado extends JFrame {
    private JLabel nombreLabel, salarioHoraLabel, horasTrabajadasLabel;
    private JTextField nombreField, salarioHoraField, horasTrabajadasField;
    private JButton calcularButton;

    public SalarioEmpleado() {
        setTitle("Cálculo de Salario Mensual");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        nombreLabel = new JLabel("Nombre:");
        salarioHoraLabel = new JLabel("Salario por hora:");
        horasTrabajadasLabel = new JLabel("Horas trabajadas:");

        nombreField = new JTextField();
        salarioHoraField = new JTextField();
        horasTrabajadasField = new JTextField();

        calcularButton = new JButton("Calcular");

        add(nombreLabel);
        add(nombreField);
        add(salarioHoraLabel);
        add(salarioHoraField);
        add(horasTrabajadasLabel);
        add(horasTrabajadasField);
        add(calcularButton);
    }

    public JTextField getNombreField() {
        return nombreField;
    }

    public JTextField getSalarioHoraField() {
        return salarioHoraField;
    }

    public JTextField getHorasTrabajadasField() {
        return horasTrabajadasField;
    }

    public JButton getCalcularButton() {
        return calcularButton;
    }
}
