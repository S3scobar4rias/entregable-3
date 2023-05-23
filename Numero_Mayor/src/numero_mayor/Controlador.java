/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero_mayor;

/**
 *
 * @author santi
 */
public class Controlador {
    private Interfaz interfaz;
    private Comparador comparador;

    public Controlador(Interfaz interfaz) {
        this.interfaz = interfaz;
        this.comparador = new Comparador();
    }

    public void compararNumeros() {
        int numeroA = interfaz.getNumeroA();
        int numeroB = interfaz.getNumeroB();

        String resultado;
        if (comparador.esMayor(numeroA, numeroB)) {
            resultado = numeroA + " es mayor que " + numeroB;
        } else if (comparador.esMenor(numeroA, numeroB)) {
            resultado = numeroA + " es menor que " + numeroB;
        } else {
            resultado = numeroA + " es igual a " + numeroB;
        }

        interfaz.mostrarResultado(resultado);
    }
}
