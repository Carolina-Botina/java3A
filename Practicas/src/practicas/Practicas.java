/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author carolina
 */
public class Practicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        /*int i=0;
        for(i=0;i<10;i++){
            System.out.println(i+1);
        }
        System.out.println("----------------------------------------------------------");
        for(i=1;i<=10;i++){
            System.out.println(i);
        }*/
        
        
        
        /*int num[]=new int[10];
        String nam[]=new String[10];
        //Insert data into vectors
         num[0]=1;
         
         nam[0]="Morgan";
         nam[1]="Peter";
         nam[2]="Juan";
         nam[3]="Manuel";
         nam[4]="Rysand";
         nam[5]="Peter";
         nam[6]="Maria";
         nam[7]="Isabel";
         nam[8]="Feyre";
         nam[9]="Az";
         //Show vector data
         System.out.println("The value at index 0 is: "+num[0]);
         System.out.println("The name at index 0 is: "+nam[0]);
         System.out.println("The vector size is: "+nam.length);
         for(int i=0;i<nam.length;i++){
             System.out.println("Name "+(i+1)+": "+nam[i]);
         }*/
        
        int suma=0,d=0;
        int numbers[]=new int[4];
        Scanner reader=new Scanner(System.in);
        //while(d==0){
        for(int i=0;i<numbers.length;i++){
            System.out.println("Ingrese un número: ");
            numbers[i]=reader.nextInt();
            for(int j=1;j<numbers.length;j++){
                suma=numbers[i]+numbers[j-1];
            }
        }
        System.out.println("suma: "+suma);
        //}
    }
   }
