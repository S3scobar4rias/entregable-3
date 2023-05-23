/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorasalario;

/**
 *
 * @author santi
 */
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                InterfazCalculadora interfaz = new InterfazCalculadora();
                interfaz.setVisible(true);
            }
        });
    }
}
