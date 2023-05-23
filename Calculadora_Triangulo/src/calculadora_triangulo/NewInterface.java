/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package calculadora_triangulo;

/**
 *
 * @author santi
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NewInterface extends JFrame implements ActionListener {
    private JLabel ladoLabel, perimetroLabel, alturaLabel, areaLabel;
    private JTextField ladoField, perimetroField, alturaField, areaField;
    private JButton calcularButton;

    public NewInterface() {
        setTitle("Calculadora de Triángulo Equilátero");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        ladoLabel = new JLabel("Lado del triángulo:");
        perimetroLabel = new JLabel("Perímetro:");
        alturaLabel = new JLabel("Altura:");
        areaLabel = new JLabel("Área:");

        ladoField = new JTextField();
        perimetroField = new JTextField();
        perimetroField.setEditable(false);
        alturaField = new JTextField();
        alturaField.setEditable(false);
        areaField = new JTextField();
        areaField.setEditable(false);

        calcularButton = new JButton("Calcular");

        // Agregar los componentes a la ventana
        add(ladoLabel);
        add(ladoField);
        add(perimetroLabel);
        add(perimetroField);
        add(alturaLabel);
        add(alturaField);
        add(areaLabel);
        add(areaField);
        add(calcularButton);

        calcularButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {
            double lado = Double.parseDouble(ladoField.getText());
            Calculadora_Triangulo triangulo = new Calculadora_Triangulo(lado);
            triangulo.calcular();

            perimetroField.setText(Double.toString(triangulo.getPerimetro()));
            alturaField.setText(Double.toString(triangulo.getAltura()));
            areaField.setText(Double.toString(triangulo.getArea()));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NewInterface().setVisible(true);
            }
        });
    }
}
