/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
     Scanner datos = new Scanner(System.in); 
      int[] lista;
      int[] lista2;
      int[] lista3;
        int n,i,j = 0;
        System.out.println("Ingrese el valor maximo  de la lista");
        n=datos.nextInt();
        lista = new int[n];
        for ( i=0;i<lista.length;i++){
        System.out.println("Ingrese el valor  para la lista "+i);
        lista [i]=datos.nextInt();
        }
        if (i%2==0){
        lista[i]=lista[j];
        System.out.println("Lista2 "+lista[j]);
        }else{
            System.out.println("La suma es");
        }
        
        }
}




   
