/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carolina
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CHALLENGE 1: P I P I P I...
        //CHALLENGE 2: I P I P I P...
        //CHALLENGE 3: P P P P P P...
        //CHALLENGE 4: I I I I I I...
        //CHALLENGE 5: I P P P P I...
        //CHALLENGE 6: P I I I I P...
        // Random numbers structure
        //(int)(N.nextDouble()*limite_superior + limite_inferior(inicio))
        Random number =new Random();
        Scanner reader=new Scanner(System.in);
        int x=0,i=0,contP=0,acumP=0,contI=0,acumI=0,limit=0;
        System.out.println("Please, type a random limit number to generate the list: ");
        limit=reader.nextInt();
        for(i=1;i<=limit;i++){
            x=(int)(number.nextDouble()*10+1);
            //System.out.println(x);
            if(x%2==0){
                contP++;  //contP=contP+1
                acumP+=x; //acumP=acumP+x
                System.out.println(x+ " es PAR");
            }else{
                contI++;
                acumI+=x;
                System.out.println(x+ " es IMPAR");
            }
        }
        System.out.println("Total pares generados: "+contP);
        System.out.println("Suma de pares generados: "+acumP);
        System.out.println("Total impares generados: "+contI);
        System.out.println("Suma de impares generados: "+acumI);
        System.out.println("-----------------------------------------------");
        
        //DICES
        Random D =new Random();
        int d1=0,d2=0;
        d1=(int)(D.nextDouble()*6+1);
        d2=(int)(D.nextDouble()*6+1);
        System.out.println("Dice 1: "+d1);
        System.out.println("Dice 2: "+d2);
    }
}
