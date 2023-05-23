/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liquidacion_matricula;

/**
 *
 * @author santi
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LiquidacionMatriculaController implements ActionListener {
    private LiquidacionMatricula liquidacionMatricula;

    public LiquidacionMatriculaController(LiquidacionMatricula liquidacionMatricula) {
        this.liquidacionMatricula = liquidacionMatricula;
        this.liquidacionMatricula.getCalcularButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == liquidacionMatricula.getCalcularButton()) {
            int ni = Integer.parseInt(liquidacionMatricula.getNiField().getText());
            String nom = liquidacionMatricula.getNomField().getText();
            double pat = Double.parseDouble(liquidacionMatricula.getPatField().getText());
            int est = Integer.parseInt(liquidacionMatricula.getEstField().getText());

            double pagMat = 50000; // Valor constante

            if (pat > 2000000 && est > 3) {
                double incremento = 0.03 * pat;
                pagMat += incremento;
            }

            String mensaje = "El estudiante con número de inscripción " + ni +
                    " y nombre " + nom + " debe pagar: $" + pagMat;
            JOptionPane.showMessageDialog(liquidacionMatricula, mensaje);
        }
    }
}

