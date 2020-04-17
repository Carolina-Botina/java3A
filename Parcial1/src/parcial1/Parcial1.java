/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author carolina
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;
        String name;
        char Name[];
        char caracter;
        Scanner reader=new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        name=reader.nextLine();
        System.out.println("Ingrese una letra: ");
        char letra=reader.nextLine().charAt(0);
        Name=name.toCharArray();
        for(int i=0;i<Name.length;i++){
            if(Name[i]==letra){
                contador++;
            }
        }
        if(contador==0){
            System.out.println("No se encontraron resultados.");
        }else{
            System.out.println("Total repeticiones de letra en el nombre: "+contador);
        }
    }
}
    

