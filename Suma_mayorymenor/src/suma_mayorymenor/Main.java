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

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Interfaz numberFinderGUI = new Interfaz();
                numberFinderGUI.setVisible(true);
            }
        });
    }
}

