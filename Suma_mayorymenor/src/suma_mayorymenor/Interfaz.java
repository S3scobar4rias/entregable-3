/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suma_mayorymenor;

/**
 *
 * @author santi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTextField numbersField;
    private JButton findButton;
    private JTextArea resultArea;

    public Interfaz() {
        setTitle("Encontrar el Mayor Valor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numbersField = new JTextField(30);
        findButton = new JButton("Encontrar");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findLargestNumber();
            }
        });

        add(new JLabel("Ingrese los números separados por comas:"));
        add(numbersField);
        add(findButton);
        add(new JScrollPane(resultArea));

        pack();
        setLocationRelativeTo(null);
    }

    private void findLargestNumber() {
        String input = numbersField.getText();
        String[] numberStrings = input.split(",");
        int[] numbers = new int[numberStrings.length];

        for (int i = 0; i < numberStrings.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numberStrings[i].trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese números enteros separados por comas.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        NumberFinder numberFinder = new NumberFinder(numbers);
        int largestNumber = numberFinder.findLargestNumber();
        resultArea.setText("La suma de los valores mayor y menor es: " + largestNumber);
    }
}