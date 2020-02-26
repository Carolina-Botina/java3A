/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a=4,b=4;
      if(a>b){
          System.out.println("El mayor es: "+a);
      }else{
          if(a<b){
              System.out.println("El mayor es: "+b);
          }else{
              if(a==b){
                  System.out.println("Son iguales");
              }
          }
      }
      int n1=0, n2=0;
      
      System.out.println("Digite un numero: ");
      Scanner reader=new Scanner(System.in);
      n1=reader.nextInt();
      System.out.println("Digite el segundo numero: ");
      n2=reader.nextInt();
      System.out.println("la suma es: "+(n1+n2));
      System.out.println("la resta es: "+(n1-n2));
      System.out.println("la multiplicacion es: "+(n1*n2));
      System.out.println("la division es: "+(n1/n2));
      
      
      int n3, n4;
      char op;
      System.out.println("Digite un numero: ");
      n3=reader.nextInt();
      System.out.println("Digite el segundo numero: ");
      n4=reader.nextInt();
      System.out.println("Elija la operacion aritmetica: s=suma,d=division,r=resta ");
      op=(char) reader.nextInt();
      if (op==s){
          System.out.println("la suma es: "+(n3+n4));}else
      { if (op==d){
          System.out.println("la resta es: "+(n3-n4));}else
      {
        System.out.println("la division es: "+(n3/n4));
      }
          
      }
    
    
    }

      
       }
