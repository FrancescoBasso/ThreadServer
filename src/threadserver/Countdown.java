/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadserver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author franc
 */
public class Countdown extends Thread {
   private int time;
   Countdown(int time){
       this.time=time;
   }

    
   
   @Override
    public void run() { 
     
    for(int i=time; i>0; i--){
        
        
        try {
            System.out.println("Secondi rimasti = "+time);
           sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Countdown.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
   
}
}
