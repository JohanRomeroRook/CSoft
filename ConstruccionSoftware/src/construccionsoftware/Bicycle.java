/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionsoftware;

/**
 *
 * @author Netpp4
 */
public class Bicycle implements Veicle{
    int speed; 
    int gear; 
      
     // to change gear 
    @Override
    public void changeGear(int newGear){ 
          
        gear = newGear; 
    } 
      
    // to increase speed 
    @Override
    public void speedUp(int increment){ 
          
        speed = speed + increment; 
    } 
      
    // to decrease speed 
    @Override
    public void applyBrakes(int decrement){ 
          
        speed = speed - decrement; 
    } 
      
    public void printStates() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    } 
} 

