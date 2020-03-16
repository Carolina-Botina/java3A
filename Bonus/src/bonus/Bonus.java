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
