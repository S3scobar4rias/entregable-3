/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ecuacion extends JFrame implements ActionListener {
    private JLabel aLabel, bLabel, cLabel;
    private JTextField aField, bField, cField;
    private JButton calcularButton;

    public Ecuacion() {
        setTitle("Cálculo de Soluciones de Ecuación de Segundo Grado");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        aLabel = new JLabel("Parámetro A:");
        bLabel = new JLabel("Parámetro B:");
        cLabel = new JLabel("Parámetro C:");

        aField = new JTextField();
        bField = new JTextField();
        cField = new JTextField();

        calcularButton = new JButton("Calcular");

        add(aLabel);
        add(aField);
        add(bLabel);
        add(bField);
        add(cLabel);
        add(cField);
        add(calcularButton);

        calcularButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            double c = Double.parseDouble(cField.getText());

            EcuacionCalculadora calculadora = new EcuacionCalculadora();
            String soluciones = calculadora.calcularSoluciones(a, b, c);

            JOptionPane.showMessageDialog(this, soluciones);
        }
    }
}
