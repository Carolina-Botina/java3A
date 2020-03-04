/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FOR
        int i=0,lim=20,contP=0,contI=0,acumP=0,acumI=0;
        for (i=1;i<=lim;i++){      //i++ => i=1+1
            System.out.println(i);
            if (i % 2 ==0){
                contP = contP + 1; //contP++
                acumP = acumP + i;
            }else{
                contI++;
                acumI = acumI + i;
            }
                
        }
        System.out.println("total pares: "+ contP);
        System.out.println("suma pares: "+ acumP);
        System.out.println("total impares: "+ contI);
        System.out.println("suma impares: "+ acumI);
        System.out.println("valor final de i: "+ i);
        System.out.println("valor final de lim: "+ lim);
        
        //WHILE, compara y ejecuta
        i=0;
        while (i<lim){
            System.out.println(i+1);
            i++;
        }
        
        int numero_tabla,limI,limF;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el número de la tabla de multiplicar: ");
        numero_tabla=reader.nextInt();
        System.out.println("Ingrese el limite inicial: ");
        limI=reader.nextInt();
        System.out.println("Ingrese el limite final: ");
        limF=reader.nextInt();
        for(i=limF;i<=limI;i++){
            System.out.println(numero_tabla+ "x" +i+ "=" +(numero_tabla*i));
            
        }
        }
            }
        
        
        
    
    

