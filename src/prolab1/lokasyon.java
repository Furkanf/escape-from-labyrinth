
package prolab1;


public class lokasyon {
    private int x;
    private int y;
    
    public lokasyon (){
      x=0;
      y=0;
    }
    public lokasyon ( int x, int y ) {
      this.x = x;
      this.y = y;
    }
    public lokasyon ( int x) {
      this.x = x;
      this.y = 0;
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
}
