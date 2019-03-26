/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab1;


public class karakter {
    private String ad;
    private String tur;
    private int x;
    private int y;
    private int label;


    public karakter(String ad, int x,int y){
        this.ad=ad;
      
        this.x=x;
        this.y=y;
    }
    
    
    
    public void enkisayol(){
       
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }

    
    public int getLabel() {
        return label;
    }

    
    public void setLabel(int label) {
        this.label = label;
    }
}
