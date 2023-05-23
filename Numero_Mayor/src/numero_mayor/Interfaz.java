/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package numero_mayor;

/**
 *
 * @author santi
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Interfaz extends JFrame {
    private JLabel numeroALabel, numeroBLabel, resultadoLabel;
    private JTextField numeroAField, numeroBField;
    private JButton compararButton;
    private JTextArea resultadoArea;
    private Controlador controlador;

    public Interfaz() {
        setTitle("Comparador de Números");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        numeroALabel = new JLabel("Valor de A:");
        numeroBLabel = new JLabel("Valor de B:");
        resultadoLabel = new JLabel("Resultado:");

        numeroAField = new JTextField();
        numeroBField = new JTextField();
        resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        compararButton = new JButton("Comparar");

        add(numeroALabel);
        add(numeroAField);
        add(numeroBLabel);
        add(numeroBField);
        add(resultadoLabel);
        add(resultadoArea);
        add(compararButton);

        compararButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.compararNumeros();
            }
        });
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public int getNumeroA() {
        return Integer.parseInt(numeroAField.getText());
    }

    public int getNumeroB() {
        return Integer.parseInt(numeroBField.getText());
    }

    public void mostrarResultado(String resultado) {
        resultadoArea.setText(resultado);
    }
}
