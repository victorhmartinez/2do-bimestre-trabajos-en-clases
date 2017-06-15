/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class JavaApplication1 {
public static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        double totalPa,desceuntoBe;
        int ciclo,valorCre;
                
        float total = (float) descuentoBecas((int) (ciclo()+valorCreditos()));
        System.out.print("El valor a pagar es: "+total);
    }
    public static float ciclo() {
        System.out.print("Ingrese el ciclo academico: ");
        int ciclo = datos.nextInt();
        float matricula = 700 + ((ciclo - 1) * 10);
        return matricula;
    }
    
    public static float valorCreditos() {
        System.out.print("Ingrese el numero de materias troncales: ");
        int troncales = datos.nextInt();
        System.out.print("Ingrese el numero de materias basicas: ");
        int basicas = datos.nextInt();
        float resultado = 0;
        resultado = ((troncales * 4 * 35)+(basicas * 3 * 35 ));
        return resultado;
    }
    
    public static double descuentoBecas (int resultado){
        Scanner input = new Scanner(System.in);
        double descuento = 0, total = 0;
        System.out.println("Seleccione su tipo de beca: ");
        System.out.println(" 1-Por meritos academicos\n 2-Beca Familiar\n 5-No tiene beca");
        int op = datos.nextInt();
        switch (op){
            case (1): 
                descuento = 0.15; 
                break;
            case (2): 
                descuento = 0.08; 
                break;
            default:
                descuento = 0;
                break;            
        }
        total = (resultado-(resultado*descuento)) * 1.14;       
        return total;
    }
}

