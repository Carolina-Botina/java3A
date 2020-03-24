/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenamiento2;
import java.util.Scanner;
/**
 *
 * @author carolina
 */
public class Entrenamiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* DESARROLLO DEL PUNTO: 1.1.Escriba un programa,
        que reciba 4 números por consola,y muestre por pantalla,cuál es el mayor de todos. (EstructuraIF)
        
        DESARROLLO DEL PUNTO: 1.2.Valide  elejercicio  1.1., de manera  que,  si  los  4 números  son iguales,
        muestre por pantalla  un  mensaje  que  indique  su  igualdad
        (SÍ  Y  SÓLO  SÍ los  4  son  iguales). (EstructuraIF)
        
        int numero_mayor=0,ban=0;
        int arreglo[]=new int [5];
        Scanner reader=new Scanner(System.in);
        for(int i=1;i<arreglo.length;i++){
            System.out.println("Ingrese el número "+i+ ":");
            arreglo[i]=reader.nextInt();
        }
        if(arreglo[1]==arreglo[2]&&arreglo[3]==arreglo[4]&&arreglo[2]==arreglo[3]){
                  System.out.println("TODOS LOS NUMEROS SON IGUALES.");
                  ban=1;
                }
        if(ban<=0){
        numero_mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>numero_mayor){
                numero_mayor=arreglo[i];
            }
                
        }
        }
        if(ban<=0){
        System.out.println("El número mayor es: "+numero_mayor);
        } */
        
       /* DESARROLLO DEL PUNTO: 1.3.Escriba un programa que muestre las tablas de multiplicar de 1 al 10, 
        con un intervalo de serie de 1 a 10. (Estructura FOR)
       
       int lim_F=10,numero;
        for(numero=1;numero<=10;numero++){
           System.out.println("-----TABLA DE MULTIPLICAR DEL "+(numero)+ "-----");
           System.out.println("------------------------------------------------");
            for(int i=1;i<=lim_F;i++){
                System.out.println(+numero+ " x " +i+ " = "+(numero*i));
            }
       }
       */
       
       /*DESARROLLO DEL PUNTO: 1.4.Escriba un programa que muestre las tablas de multiplicar de 1 al 10
       con un intervalo de serie de 1 a 10.
       (Estructura WHILE)
       
       for(int numero=1;numero<=10;numero++){
           System.out.println("");
           System.out.println("*******TABLA DE MULTIPLICAR DEL "+numero+ "*******");
           System.out.println("");
       for(int lim=1;lim<=10;lim++){    
           while(lim<=10){
               System.out.println(+numero+ " x " +lim+ " = " +(numero*lim));
               lim++;
           }
       }
       }*/
       
       /*DESARROLLO DEL PUNTO: 1.5.Escriba un  programa que solicite el número de la tabla de multiplicar a operar y el límite de la serie a mostrar
        (El intervalo de datos a visualizar debe iniciar en 1)
        
        int numero,limite; 
        Scanner reader=new Scanner (System.in);
        System.out.println("Ingrese el número de la tabla de multiplicar a operar: ");
        numero=reader.nextInt();
        System.out.println("Ingrese el limite final: ");
        limite=reader.nextInt();
        for(int i=numero;i<=numero;i++){
            System.out.println("TABLA DE MULTIPLICAR DEL "+i);
            for(int lim_I=1;lim_I<=limite;lim_I++){
                System.out.println(+numero+ " x " +lim_I+ " = "+(numero*lim_I));
            }
        }*/
       
        /*DESARROLLO DEL PUNTO: 1.6.Escriba un programa,que reciba 4 números por consola,y muestre por pantalla 
        cuáles el mayor de todos. Al finalizar debe visualizar el siguiente reporte:Suma de los pares, Suma de los impares
        
        int numero []=new int [4];
        int numero_mayor,suma_pares=0,suma_impares=0;
        Scanner reader=new Scanner(System.in);
        for(int i=0;i<numero.length;i++){
            System.out.println("Ingrese el número "+(i+1)+":");
            numero[i]=reader.nextInt();
        }
        numero_mayor=numero[0];
        for(int i=0;i<numero.length;i++){
            if(numero[i]>numero_mayor){
                numero_mayor=numero[i];
            }
            if(numero[i]%2==0){
                suma_pares=numero[i]+suma_pares;
            }else{
                suma_impares=numero[i]+suma_impares;
            }
        }
        System.out.println("El número mayor es: "+numero_mayor);
        System.out.println("Suma de los pares: "+suma_pares);
        System.out.println("Suma de los impares: "+suma_impares);
        */
        
        /*DESARROLLO DEL PUNTO: 1.7.Escriba un programa que genere tire los dados N veces, y finalice ÚNICAMENTE
        cuando el PAR generado sea 1 y 1
        
        int dado1,dado2,i=0;
        String tecla;
        Scanner reader=new Scanner (System.in);
        dado1=(int)(Math.random()*6+1);
        dado2=(int)(Math.random()*6+1);
        while(i==0){
            dado1=(int)(Math.random()*6+1);
            dado2=(int)(Math.random()*6+1);
            System.out.println("Presione una tecla para lanzar los dados: ");
            tecla=reader.nextLine();
            System.out.println("dado1: "+dado1);
            System.out.println("dado2: "+dado2);
                if(dado1==1 && dado2==1){
                    System.out.println("FINALIZADO");
                    i=1;
                }
            } */
        
    }
    }
        
    

