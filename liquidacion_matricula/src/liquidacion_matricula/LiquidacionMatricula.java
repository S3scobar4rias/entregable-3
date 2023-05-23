/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package liquidacion_matricula;

/**
 *
 * @author santi
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LiquidacionMatricula extends JFrame {
    private JTextField niField, nomField, patField, estField;
    private JButton calcularButton;

    public LiquidacionMatricula() {
        setTitle("Cálculo de Pago de Matrícula");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel niLabel = new JLabel("Número de inscripción:");
        JLabel nomLabel = new JLabel("Nombres:");
        JLabel patLabel = new JLabel("Patrimonio:");
        JLabel estLabel = new JLabel("Estrato social:");

        niField = new JTextField();
        nomField = new JTextField();
        patField = new JTextField();
        estField = new JTextField();

        calcularButton = new JButton("Calcular");

        add(niLabel);
        add(niField);
        add(nomLabel);
        add(nomField);
        add(patLabel);
        add(patField);
        add(estLabel);
        add(estField);
        add(new JLabel()); // Espacio en blanco para mantener la estructura
        add(calcularButton);
    }

    public JTextField getNiField() {
        return niField;
    }

    public JTextField getNomField() {
        return nomField;
    }

    public JTextField getPatField() {
        return patField;
    }

    public JTextField getEstField() {
        return estField;
    }

    public JButton getCalcularButton() {
        return calcularButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LiquidacionMatricula liquidacionMatricula = new LiquidacionMatricula();
                LiquidacionMatriculaController controller = new LiquidacionMatriculaController(liquidacionMatricula);
                liquidacionMatricula.setVisible(true);
            }
        });
    }
}

