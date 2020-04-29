/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package market;

import java.util.ArrayList;

/**
 *
 * @author carolina
 */
public class Market {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Chevrolet");//0
        cars.add("Mazda");//1
        cars.add("Nissan");//2
        cars.add("Suzuki");//3
        cars.add("Yamaha");//4
        for(int i=0; i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        
        System.out.println("--------------------------------------------------------------");
        
        System.out.println(cars.get(2));
        String old_car=cars.get(2);
        cars.set(2, "Nissan March");
        System.out.println(old_car+" is new: "+cars.get(2));
        cars.remove(1);
        System.out.println(cars.get(1));
        System.out.println(cars.size());
        cars.clear();
        System.out.println(cars);
    }
    
}
