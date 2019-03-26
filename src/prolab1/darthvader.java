/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab1;

/**
 *
 * @author furkn
 */

public class darthvader extends karakter{
    
    public darthvader(String ad,  int x, int y) {
        super(ad, x, y);
         super.setTur("kotu");
    }
    
   
    public int enkisayol(int x,int y,int targetx,int targety){
      
        if(x<targetx){
            x++;
        }else if(y<targety){
            y++;
        }
        else if(x>targetx){
           x--;
        }else if(y>targety){
            y--;
        }

        System.out.println("\n darthvader burda "  + x + "  " +y);
        
       return (x*14+y); 
    }
}
