/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class JavaApplication5 {
static double iva =0.14;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos=new Scanner(System.in); 
       //Creo la variable para pedir  por consola los datos
       double resultado;
       mensaje();
       resultado=calculosiva(354,iva);
       System.out.println("El calculo del iva es: "+resultado);
    }
    public static void mensaje(){
        System.out.println("Mensajes de la funcion mensaje");      
    }
    public static double calculosiva(double subtotal,double iva){
        double total=0;double subtotal2;
        subtotal2=subtotal*iva;
        total=subtotal2+subtotal;
        return total;                     
        
    }
    
}

    
