/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;
import java.util.Scanner;
/**
 *
 * @author carolina
 */
public class Bonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Scanner reader=new Scanner (System.in);
        System.out.println("Ingrese el tamaño del rangoli: ");
        N=reader.nextInt();
<<<<<<< HEAD
        for(char i='a';i<='z';i++){
            System.out.print("-"+i);
        }
            for(char f='z';f>='a';f--){
                System.out.print("-"+f);
            }
        }
    }
=======
        for(char i='z';i>='a';i--){
            for(char j='a';j>='z';j++){
                System.out.println("-"+j);
            }
            if(N>0){
            System.out.print("-"+i);
            }
        }
    }
}
>>>>>>> 1444ba2b308bad55720dbf67ce60950eecdcd29d
