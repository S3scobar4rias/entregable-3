/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carreraciclística;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class Prueba {
    /**
     * Método main que crea un equipo. Luego, crea un escalador, un
     * velocista y un contrarrelojista. Estos tipos de ciclistas son añadidos
     * al equipo. Se asignan tiempos a cada ciclista para al final obtener el
     * tiempo total del equipo
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese el País del equipo: ");
        String PaisEquipo = scanner.nextLine();
        System.out.print("Ingrese el Nombre del velocista: ");
        String nvelocistaEquipo = scanner.nextLine();
        System.out.print("Ingrese el Nombre del escalador: ");
        String nescaladorEquipo = scanner.nextLine();
        System.out.print("Ingrese el Nombre del contrarrelojista: ");
        String ncontraEquipo = scanner.nextLine();
        
        System.out.print("Ingrese el identificador del velocista: ");
        int ivelocistaEquipo = scanner.nextInt();
        System.out.print("Ingrese la potencia promedio del velocista: ");
        int pvelocistaEquipo = scanner.nextInt();
        System.out.print("Ingrese la velocidad promedio del velocista: ");
        int vvelocistaEquipo = scanner.nextInt();
        System.out.print("Ingrese el identificador del escalador: ");
        int iescaladorEquipo = scanner.nextInt();
        System.out.print("Ingrese la aceleración promedio del escalador: ");
        int pescaladorEquipo = scanner.nextInt();
        System.out.print("Ingrese el grado de la rampa: ");
        int vescaladorEquipo = scanner.nextInt();
        System.out.print("Ingrese el identificador del contrarrelojista: ");
        int icontraEquipo = scanner.nextInt();
        System.out.print("Ingrese la velocidad Maxima del contrarrelojista ");
        int pcontraEquipo = scanner.nextInt();
        
        Equipo equipo1 = new Equipo(nombreEquipo, PaisEquipo);
        Velocista velocista1 = new Velocista(ivelocistaEquipo, nvelocistaEquipo, pvelocistaEquipo, vvelocistaEquipo);
        Escalador escalador1 = new Escalador(iescaladorEquipo, nescaladorEquipo, pescaladorEquipo, vescaladorEquipo);
        Contrarrelojista contrarrelojista1 = new Contrarrelojista(icontraEquipo, ncontraEquipo, pcontraEquipo);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista1);

        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista1.setTiempoAcumulado(370);

        equipo1.calcularTotalTiempo();
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
}
