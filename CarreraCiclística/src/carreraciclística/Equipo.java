/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreraciclística;

/**
 *
 * @author santi
 */
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private double totalTiempo;
    private String país;
    private List<Ciclista> listaCiclistas;

    public Equipo(String nombre, String país) {
        this.nombre = nombre;
        this.país = país;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }

    public void calcularTotalTiempo() {
        totalTiempo = 0;
        for (Ciclista ciclista : listaCiclistas) {
            totalTiempo += ciclista.getTiempoAcumulado();
        }
    }

    public void imprimir() {
        System.out.println("Nombre del equipo: " + nombre);
        System.out.println("País: " + país);
        System.out.println("Total tiempo del equipo: " + totalTiempo);
    }

    public void listarEquipo() {
        for (Ciclista ciclista : listaCiclistas) {
            System.out.println(ciclista.getNombre());
        }
    }
}


