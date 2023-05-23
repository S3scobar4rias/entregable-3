/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadora_raiz;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame {
    private JLabel numberLabel;
    private JTextField numberField;
    private JButton calculateButton;
    private JTextArea resultArea;

    public CalculatorGUI() {
        setTitle("Calculadora de Raíz Cuadrada, Cuadrado y Cubo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numberLabel = new JLabel("Ingrese un número:");
        numberField = new JTextField(10);
        calculateButton = new JButton("Calcular");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        add(numberLabel);
        add(numberField);
        add(calculateButton);
        add(new JScrollPane(resultArea));

        pack();
        setLocationRelativeTo(null);
    }

    private void calculate() {
        String input = numberField.getText();
        try {
            int number = Integer.parseInt(input);
            Calculadora_raiz calculator = new Calculadora_raiz(number);
            resultArea.setText(calculator.getResult());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entero válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
