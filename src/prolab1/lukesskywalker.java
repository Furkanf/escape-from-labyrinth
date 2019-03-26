
package prolab1;


public class lukesskywalker extends karakter{
    private float can=3;
    public lukesskywalker(String ad, int x, int y) {
        super(ad, x, y);
         super.setTur("iyi");
    }

    public float getCan() {
        return can;
    }
    
    public void setCan(float can) {
        this.can = can;
    }
    
}
