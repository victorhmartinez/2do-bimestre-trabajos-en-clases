/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
/**
 *
 * @author Salas
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner datos = new Scanner(System.in);
       // declaracion de variables
       int [][]mat;
       int x,y;
      System.out.println("Ingrese el limite de la matriz ");
      int limite=datos.nextInt();
      mat= new int [limite][limite];
       System.out.println("Llenado de matriz ");
       for (x=0;x<limite;x++){
           for (y=0;y<limite;y++){             
               mat[x][y]=datos.nextInt();                                            
           }
       }
      System.out.println("Presentacion de la matriz");
      for (x=0;x<limite;x++){
           for (y=0;y<limite;y++){                                      
                 System.out.print(mat[x][y]+" "); 
           }
           System.out.println(" ");    
      }      
       //Presentacion de la fila inferior
       System.out.println("Presentacion de la matriz");
       for(y=0;y<limite;y++){
       System.out.print(mat[limite-1][y]+" ");
       }
       System.out.println("\n Presentacion de la diagonal principal");
       for(x=0;x<limite;x++){
           for (y=0;y<limite;y++){
               if(x==y){
                   System.out.print(mat[x][y]+"  ");
               }
           }
       }
       System.out.println("\n Presentacion de la diagonal secundaria");
       for(x=0;x<limite;x++){
           for (y=0;y<limite;y++){
               if(x+y==limite-1){
                 System.out.print(mat[x][y]+"  ");     
                }
            }
        } 
       System.out.println("\n Presentacion de los elementos qu estan sobre  de la diagonal principal");
       for(x=0;x<limite;x++){
           for (y=0;y<limite;y++){
               if(x<y){
                 System.out.print(mat[x][y]+"  ");     
                }
            }
        }
       System.out.println("\n Presentacion de los elementos que estan sobre de la diagonal secunadria");
       for(x=0;x<limite;x++){
           for (y=0;y<limite;y++){
               if(x+y<limite-1){
                 System.out.print(mat[x][y]+"  ");     
                }
            }
        }
    }    
}
       
   