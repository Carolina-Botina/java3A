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
        que reciba 4 números por consola,y muestre por pantalla,cuál es el mayor de todos. (EstructuraIF)*/
        
        int numero_mayor;
        int arreglo[]=new int [4];
        Scanner reader=new Scanner(System.in);
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Ingrese el número "+(i+1));
            arreglo[i]=reader.nextInt();
        }
        numero_mayor=arreglo[0];
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]>numero_mayor){
                numero_mayor=arreglo[i];
            }
        }
        System.out.println("El número mayor es: "+numero_mayor);
    }
    
}
