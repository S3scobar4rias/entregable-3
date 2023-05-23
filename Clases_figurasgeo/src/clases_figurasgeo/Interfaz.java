/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_figurasgeo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame implements ActionListener {
    private JButton btnCirculo;
    private JButton btnCuadrado;
    private JButton btnRectangulo;
    private JButton btnRombo;
    private JButton btnTrapecio;
    private JButton btnTrianguloRectangulo;

    public Interfaz() {
        setTitle("Figuras Geométricas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new FlowLayout());

        btnCirculo = new JButton("Círculo");
        btnCirculo.addActionListener(this);
        add(btnCirculo);

        btnCuadrado = new JButton("Cuadrado");
        btnCuadrado.addActionListener(this);
        add(btnCuadrado);

        btnRectangulo = new JButton("Rectángulo");
        btnRectangulo.addActionListener(this);
        add(btnRectangulo);

        btnRombo = new JButton("Rombo");
        btnRombo.addActionListener(this);
        add(btnRombo);

        btnTrapecio = new JButton("Trapecio");
        btnTrapecio.addActionListener(this);
        add(btnTrapecio);

        btnTrianguloRectangulo = new JButton("Triángulo Rectángulo");
        btnTrianguloRectangulo.addActionListener(this);
        add(btnTrianguloRectangulo);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Interfaz();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCirculo) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el radio del círculo:"));
            Circulo circulo = new Circulo((int) radio);
            JOptionPane.showMessageDialog(this, "Área del círculo: " + circulo.calcularArea()
                    + "\nPerímetro del círculo: " + circulo.calcularPerimetro());
        } else if (e.getSource() == btnCuadrado) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el lado del cuadrado:"));
            Cuadrado cuadrado = new Cuadrado((int) lado);
            JOptionPane.showMessageDialog(this, "Área del cuadrado: " + cuadrado.calcularArea()
                    + "\nPerímetro del cuadrado: " + cuadrado.calcularPerimetro());
        } else if (e.getSource() == btnRectangulo) {
            double base = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la base del rectángulo:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la altura del rectángulo:"));
            Rectangulo rectangulo = new Rectangulo((int) base, (int) altura);
            JOptionPane.showMessageDialog(this, "Área del rectángulo: " + rectangulo.calcularArea()
                    + "\nPerímetro del rectángulo: " + rectangulo.calcularPerimetro());
        } else if (e.getSource() == btnRombo) {
            double lado = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el lado del rombo:"));
            double diagonalMayor = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la diagonal mayor del rombo:"));
            double diagonalMenor = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la diagonal menor del rombo:"));
            Rombo rombo = new Rombo((int) lado, (int) diagonalMayor, (int) diagonalMenor);
            JOptionPane.showMessageDialog(this, "Área del rombo: " + rombo.calcularArea()
                    + "\nPerímetro del rombo: " + rombo.calcularPerimetro());
        } else if (e.getSource() == btnTrapecio) {
            double baseMayor = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la base mayor del trapecio:"));
            double baseMenor = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la base menor del trapecio:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la altura del trapecio:"));
            double lado1 = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el lado 1 del trapecio:"));
            double lado2 = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese el lado 2 del trapecio:"));
            Trapecio trapecio = new Trapecio((int) baseMayor, (int) baseMenor, (int) altura, (int) lado1, (int) lado2);
            JOptionPane.showMessageDialog(this, "Área del trapecio: " + trapecio.calcularArea()
                    + "\nPerímetro del trapecio: " + trapecio.calcularPerimetro());
        } else if (e.getSource() == btnTrianguloRectangulo) {
            double base = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la base del triángulo:"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese la altura del triángulo:"));
            TrianguloRectangulo triangulo = new TrianguloRectangulo((int) base, (int) altura);
            JOptionPane.showMessageDialog(this, "Área del triángulo: " + triangulo.calcularArea()
                    + "\nPerímetro del triángulo: " + triangulo.calcularPerimetro() + "\nTipo del triángulo: " );
            triangulo.determinarTipoTriangulo();
        }
    }
}

