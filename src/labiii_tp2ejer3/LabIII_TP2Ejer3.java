/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labiii_tp2ejer3;

/**
 *
 * @author Claudia
 */
public class LabIII_TP2Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Inmobiliaria I = new Inmobiliaria(4,4);
       I.cargar();
       I.cargarP();
       I.imprimirE();
       I.imprimirP();
       I.actualizacionDeInfo();
       I.eliminar();
       
       //I.compactar(k, dimension);
    }
}
