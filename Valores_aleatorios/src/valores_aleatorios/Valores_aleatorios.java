/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valores_aleatorios;
import java.util.Scanner;
/**
 *
 * @author carolina
 */
public class Valores_aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant_numeros=0,rango_I,rango_S,cont_P=0,cont_I=0,suma_P=0,cont_paresN=0,cont_imparesN=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("----------Bienvenido----------");
        System.out.println("Ingrese el número de valores aleatorios a generar: ");
        cant_numeros=reader.nextInt();
        do{
        System.out.println("Ingrese un rango inferior: ");
        rango_I=reader.nextInt();
        System.out.println("Ingrese un rango superior: ");
        rango_S=reader.nextInt();
            if(rango_I>rango_S){
                System.out.println("EL RANGO INFERIOR NO PUEDE SER MAYOR QUE EL RANGO SUPERIOR");
            }
        }while(rango_I>rango_S);
        int numero=(int)Math.floor(Math.random()*(rango_S-rango_I)+rango_I);
        for(int i=0;i<cant_numeros;i++){
            System.out.println("Los numeros son: "+numero);
            if(numero >-0 && numero%2==0){
                cont_P++;
            }else{
                cont_imparesN++;
            }
            if(numero<-0 && numero%2==0){
                numero=numero +cont_paresN++;
            }else{
                cont_I++;
            }
        }
        System.out.println("Total de pares positivos: "+cont_P);
        System.out.println("Total de impares positivos: "+cont_I);
        System.out.println("Total de pares negativos: "+cont_paresN);
        System.out.println("Total de impares negativos: "+cont_imparesN);
        System.out.println("Suma de pares negativos: "+suma_P);
    
}
}
    

