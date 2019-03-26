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
public class masteryoda extends karakter{
    private float can=6;
    
    
    public masteryoda(String ad, int x, int y) {
        super(ad,  x, y);
         super.setTur("iyi");
    }

   
    public float getCan() {
        return can;
    }
    public void setCan(float can) {
        this.can = can;
    }
    
}
