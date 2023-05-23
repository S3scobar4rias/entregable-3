/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadorasalario;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazCalculadora extends JFrame implements ActionListener {
    private JLabel codigoLabel, nombresLabel, horasLabel, valorHoraLabel, retencionLabel;
    private JTextField codigoField, nombresField, horasField, valorHoraField, retencionField;
    private JButton calcularButton;

    public InterfazCalculadora() {
        setTitle("Calculadora de Salario");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        codigoLabel = new JLabel("Código del empleado:");
        nombresLabel = new JLabel("Nombres del empleado:");
        horasLabel = new JLabel("Horas trabajadas al mes:");
        valorHoraLabel = new JLabel("Valor hora trabajada:");
        retencionLabel = new JLabel("Porcentaje de retención:");

        codigoField = new JTextField();
        nombresField = new JTextField();
        horasField = new JTextField();
        valorHoraField = new JTextField();
        retencionField = new JTextField();

        calcularButton = new JButton("Calcular");

        add(codigoLabel);
        add(codigoField);
        add(nombresLabel);
        add(nombresField);
        add(horasLabel);
        add(horasField);
        add(valorHoraLabel);
        add(valorHoraField);
        add(retencionLabel);
        add(retencionField);
        add(calcularButton);

        calcularButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            int codigo = Integer.parseInt(codigoField.getText());
            String nombres = nombresField.getText();
            int horasTrabajadas = Integer.parseInt(horasField.getText());
            double valorHora = Double.parseDouble(valorHoraField.getText());
            double retencion = Double.parseDouble(retencionField.getText());

            CalculadoraSalario calculadora = new CalculadoraSalario();
            double salarioNeto = calculadora.calcularSalarioNeto(horasTrabajadas, valorHora, retencion);
            double salarioBruto = calculadora.calcularSalarioBruto(horasTrabajadas, valorHora);

            String mensaje = "Código: " + codigo + "\n" + "Nombres: " + nombres + "\n" + "Salario Neto: " + salarioNeto + "\n" +
                    "Salario Bruto: " + salarioBruto + "\n";

            JOptionPane.showMessageDialog(this, mensaje);
        }
    }
}
