/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package labiii_tp2ejer3;

/**
 *
 * @author Claudia
 */
import java.util.*;
public class Inmobiliaria {
    private int E[];
    private float P[];
    //int N=4;
    //int M=4;
    Scanner ingreso;
    Scanner entrada;
    
     public Inmobiliaria(int dim, int dim1) {
        E = new int[dim1];
        ingreso = new Scanner(System.in);
        P = new float[dim];
       entrada = new Scanner(System.in);
    
    }
      public void cargar() {

        for (int i = 0; i <E.length; i++) {

            System.out.println("\n Ingresar los elementos del Arreglo extencion\t");
            E[i] = ingreso.nextInt();
        }
        System.out.println("_______________________________________________________________\t");
    }
      
      public void cargarP() {

        for (int i = 0; i <P.length; i++) {

            System.out.println("\n Ingresar los elementos del Arreglo precio\t");
            P[i] = entrada.nextInt();
        }
        System.out.println("_______________________________________________________________\t");
    }

    public void imprimirE() {

        System.out.print("\n El arreglo Extencion esta compuesto por los siguientes elementos: \n");
        for (int i = 0; i < E.length; i++) {
            System.out.print("\n El numero almacenado en la posición: " + i + ", es el: " + E[i] + "\n");
        }
        System.out.println("_______________________________________________________________\t");
    }
    public void imprimirP() {
                
        System.out.print("\n El arreglo Precio esta compuesto por los siguientes elementos: \n");
        for (int i = 0; i < P.length; i++) {
            System.out.print("\n El numero almacenado en la posición: " + i + ", es el: " + P[i] + "\n");
        }
        System.out.println("_______________________________________________________________\t");
    }
   public void eliminar() {
        int i = 0;
        int k;
        int dim = P.length;
        int dim1 = E.length;
        float Sup;
        float Prec;
        System.out.println("_______________________________________________________________\t");
        System.out.println("Ingrese la superficie: ");
        Sup=ingreso.nextFloat();
        System.out.println("_______________________________________________________________\t");
        System.out.println("Ingrese el precio: ");
        Prec=ingreso.nextFloat();
        while (i < dim - 1 && i < dim1-1) {
            if (E[i]>= Sup && P[i]<= Prec) {
                //k=i;
                 compactar(i, dim, dim1);
                 dim = dim - 1;
                 dim1 = dim1 - 1;
                }
                else{
                     i++;
                }
        }
   
      int   N = dim;
      int   M = dim1;
        System.out.println("_______________________________________________________________\t");
        System.out.print("\n el arreglo Precio que queda es: \n");
        for (int a = 0; a < N; a++) {
            System.out.print("\n El numero almacenado en la posición: " + a + ", es el: " + P[a] + "\n");
        }
        System.out.println("_______________________________________________________________\t");
        System.out.print("\n el arreglo Extencion que queda es: \n");
        for (int b = 0; b < M; b++) {
            System.out.print("\n El numero almacenado en la posición: " + b + ", es el: " + E[b] + "\n");

        }
       
    
   } 
    public void compactar(int k, int dim, int dim1){
        int j=k;
        while (j < dim - 1 && j < dim1-1) {
                    P[j] = P[j+ 1];
                    E[j] = E[j+1];
                    j = j + 1;
                }
    }
public void actualizacionDeInfo(){
    int opcion;
    int i;
    System.out.println("_______________________________________________________________\t");
     System.out.println("\n Ingresar la posicion del departamento\t");
     int k= ingreso.nextInt();
     System.out.println("_______________________________________________________________\t");
     System.out.println("\n Decea renovar el contrato: SI:1 o NO:0");
     opcion= ingreso.nextInt();
     if(opcion!=1){
         P[k]=0;
         E[k]=0;
          
     }
     else{
         float sum=P[k];
         P[k]= sum + P[k];
     }
     for(i=0;i<P.length;i++){
        System.out.println("\n El arreglo del Precio es: " + P[i]);  
     }
     for(i=0;i<E.length;i++){
        System.out.println("\n El arreglo del Precio es: " + E[i]);  
     }         
  }
}

