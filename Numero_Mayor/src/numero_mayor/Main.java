/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero_mayor;

/**
 *
 * @author santi
 */
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Interfaz interfaz = new Interfaz();
            Controlador controlador = new Controlador(interfaz);
            interfaz.setControlador(controlador);
            interfaz.setVisible(true);
        });
    }
}
