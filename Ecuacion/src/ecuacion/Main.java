/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion;

/**
 *
 * @author santi
 */
import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ecuacion ecuacion = new Ecuacion();
                ecuacion.setVisible(true);
            }
        });
    }
}
