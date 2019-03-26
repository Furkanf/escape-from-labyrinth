package prolab1;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static prolab1.Prolab1.matrix;

/**
 *
 * @author furkn
 */
public class mainpage extends javax.swing.JFrame {
    masteryoda yoda;
    lukesskywalker skywalker;
    stormtrooper storm;
    darthvader darth;
    kyloren kyloren;
    
    public mainpage() {
        initComponents();        
        jPanel1.setVisible(true);
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        yodaicon = new javax.swing.JLabel();
        skywalkericon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        skywalkerbutton = new javax.swing.JRadioButton();
        kylorenn = new javax.swing.JRadioButton();
        darthvaderpng = new javax.swing.JLabel();
        stormtrooperpng = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yodabutton = new javax.swing.JRadioButton();
        darthvader = new javax.swing.JRadioButton();
        stormtrooper = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        progressbar = new javax.swing.JProgressBar();
        goodchar = new javax.swing.JLabel();
        badchar1 = new javax.swing.JLabel();
        health = new javax.swing.JLabel();
        badchar2 = new javax.swing.JLabel();
        badchar3 = new javax.swing.JLabel();
        badchar4 = new javax.swing.JLabel();
        badchar5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        badchar6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 555));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(554, 516));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 255));
        jButton1.setText("BASLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(380, 460, 155, 41);

        yodaicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/Yodamenu_1.png"))); // NOI18N
        jPanel1.add(yodaicon);
        yodaicon.setBounds(60, 70, 83, 120);

        skywalkericon.setForeground(new java.awt.Color(255, 255, 255));
        skywalkericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/skywalkermenu_1.png"))); // NOI18N
        jPanel1.add(skywalkericon);
        skywalkericon.setBounds(280, 30, 90, 170);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Dusman veya dusmanlari seciniz!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 220, 330, 24);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Kullanici adi");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 450, 140, 20);

        skywalkerbutton.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(skywalkerbutton);
        skywalkerbutton.setText("SkyWalker");
        jPanel1.add(skywalkerbutton);
        skywalkerbutton.setBounds(290, 190, 120, 18);

        kylorenn.setBackground(new java.awt.Color(0, 153, 153));
        kylorenn.setText("kyloren");
        kylorenn.setFocusCycleRoot(true);
        kylorenn.setFocusPainted(false);
        jPanel1.add(kylorenn);
        kylorenn.setBounds(340, 390, 80, 18);

        darthvaderpng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/darthvadermenu.png"))); // NOI18N
        jPanel1.add(darthvaderpng);
        darthvaderpng.setBounds(60, 260, 90, 140);

        stormtrooperpng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/stormtroopermenu.png"))); // NOI18N
        jPanel1.add(stormtrooperpng);
        stormtrooperpng.setBounds(220, 270, 60, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/kyloren.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 280, 90, 110);

        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(153, 0, 255));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(username);
        username.setBounds(220, 470, 150, 30);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setText("Lutfen kahramaninizi seciniz!");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(100, 20, 330, 24);

        yodabutton.setBackground(new java.awt.Color(0, 153, 153));
        buttonGroup1.add(yodabutton);
        yodabutton.setText("Yoda");
        yodabutton.setFocusCycleRoot(true);
        yodabutton.setFocusPainted(false);
        jPanel1.add(yodabutton);
        yodabutton.setBounds(70, 190, 80, 18);

        darthvader.setBackground(new java.awt.Color(0, 153, 153));
        darthvader.setText("Darthvader");
        darthvader.setFocusCycleRoot(true);
        darthvader.setFocusPainted(false);
        jPanel1.add(darthvader);
        darthvader.setBounds(60, 390, 100, 18);

        stormtrooper.setBackground(new java.awt.Color(0, 153, 153));
        stormtrooper.setText("Stormtrooper");
        stormtrooper.setFocusCycleRoot(true);
        stormtrooper.setFocusPainted(false);
        jPanel1.add(stormtrooper);
        stormtrooper.setBounds(190, 390, 110, 18);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 554, 516);

        jPanel2.setMinimumSize(new java.awt.Dimension(556, 516));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });
        jPanel2.setLayout(null);

        progressbar.setBackground(new java.awt.Color(0, 0, 204));
        progressbar.setForeground(new java.awt.Color(153, 102, 255));
        progressbar.setValue(100);
        progressbar.setAlignmentX(0.1F);
        progressbar.setAlignmentY(0.1F);
        progressbar.setBorderPainted(false);
        jPanel2.add(progressbar);
        progressbar.setBounds(320, 10, 170, 30);

        goodchar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/yoda.png"))); // NOI18N
        jPanel2.add(goodchar);
        goodchar.setBounds(250, 260, 20, 30);
        jPanel2.add(badchar1);
        badchar1.setBounds(470, 260, 20, 30);

        health.setBackground(new java.awt.Color(255, 51, 102));
        health.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        health.setForeground(new java.awt.Color(0, 102, 102));
        health.setText("CANLAR");
        jPanel2.add(health);
        health.setBounds(230, 10, 100, 30);
        jPanel2.add(badchar2);
        badchar2.setBounds(190, 420, 20, 30);
        jPanel2.add(badchar3);
        badchar3.setBounds(60, 260, 30, 30);
        jPanel2.add(badchar4);
        badchar4.setBounds(180, 100, 30, 30);
        jPanel2.add(badchar5);
        badchar5.setBounds(430, 100, 30, 30);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/map.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 556, 519);

        badchar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab1/source/yoda.png"))); // NOI18N
        jPanel2.add(badchar6);
        badchar6.setBounds(460, 260, 30, 30);

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 30, 41, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 556, 516);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ArrayList<karakter> bar = new ArrayList<>();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lutfen kullanici adinizi giriniz", "Dikkat", -1);
        }else{
        ImageIcon iconLogo; 
        
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel2.requestFocusInWindow(); //focus icin gerekli.
        
        if(yodabutton.isSelected()){
            System.out.println("yoda secildi");
            yoda = new masteryoda(username.getText(),5,6);
            yoda.setAd(username.getText());
            iconLogo = new ImageIcon(".\\src\\prolab1\\source\\yoda.png");
            goodchar.setIcon(iconLogo); 
            
        }
        if(skywalkerbutton.isSelected()){
            System.out.println("skywalker secildi");
            skywalker = new lukesskywalker(username.getText(),5,6);        
            iconLogo = new ImageIcon(".\\src\\prolab1\\source\\skywalker.png");
            goodchar.setIcon(iconLogo);  
        }
        
        
        
        if(darthvader.isSelected()){
            System.out.println("kotu adam darthvader secildi");
            darth = new darthvader("darthvader",1,1);
            bar.add(darth);
           
        }
        if(stormtrooper.isSelected()){
            System.out.println("kotu adam stormtrooper secildi.");
            storm = new stormtrooper("stormtrooper",1,1);
            bar.add(storm);

        }
        if(kylorenn.isSelected()){
            System.out.println("kotu adam kyloren secildi.");
            kyloren = new kyloren("kyloren",1,1);
            bar.add(kyloren);
        }

        img_atama(bar);
      }

    }//GEN-LAST:event_jButton1ActionPerformed

        void img_atama(ArrayList<karakter> bar){    //kotu karakterlerin rastgele konumlarini verir.
            
            Random r=new Random(); 
            int a;
            int[] b = {-1,-1,-1,-1};
            
            ImageIcon iconLogo;
            
            for (int i = 0; i < bar.size() ; i++) {
            a=r.nextInt(5);
           
                
            if(a!=b[0] && a!=b[1]){
            if(a==0){
                iconLogo = new ImageIcon(".\\src\\prolab1\\source\\"+bar.get(i).getAd()+"game.png");
                badchar1.setIcon(iconLogo);
                b[i] = a;
                bar.get(i).setX(5);
                bar.get(i).setY(13);
                bar.get(i).setLabel(1);
            }if(a==1){
                iconLogo = new ImageIcon(".\\src\\prolab1\\source\\"+bar.get(i).getAd()+"game.png");
                badchar2.setIcon(iconLogo);
                b[i] = a;
                bar.get(i).setX(10);
                bar.get(i).setY(4);
                bar.get(i).setLabel(2);
            }if(a==2){
                iconLogo = new ImageIcon(".\\src\\prolab1\\source\\"+bar.get(i).getAd()+"game.png");
                badchar3.setIcon(iconLogo);
                b[i] = a;
                bar.get(i).setX(5);
                bar.get(i).setY(0);
                bar.get(i).setLabel(3);
            }if(a==3){
                iconLogo = new ImageIcon(".\\src\\prolab1\\source\\"+bar.get(i).getAd()+"game.png");
                badchar4.setIcon(iconLogo);
                b[i] = a;
                bar.get(i).setX(0);
                bar.get(i).setY(4);
                bar.get(i).setLabel(4);
            }if(a==4){
                iconLogo = new ImageIcon(".\\src\\prolab1\\source\\"+bar.get(i).getAd()+"game.png");
                badchar5.setIcon(iconLogo);
                b[i] = a;
                bar.get(i).setX(0);
                bar.get(i).setY(12);
                bar.get(i).setLabel(5);
            }
            }else{
                i--;
            }
            }
        }
    
               
    public int func(int key,karakter f){
        
        int a,tmpx=1,tmpy=1;
        int flag=0;
        
          
        switch(key)
        {
            case KeyEvent.VK_UP:
                try {
                a = matrix[f.getX()-1][f.getY()];
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("disari cikilamaz");
                   break;
                }
                if(matrix[f.getX()-1][f.getY()]==1){
                goodchar.setLocation(goodchar.getLocation().x, goodchar.getLocation().y - 32);
                f.setX(f.getX()-1);
                flag=1;
                }
                else               
                System.out.println("hatali yon");
                break;
                
            case KeyEvent.VK_DOWN:
                try {
                a = matrix[f.getX()+1][f.getY()];
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("disari cikilamaz");
                    break;
                }
                if(matrix[f.getX()+1][f.getY()]==1)
                {
                goodchar.setLocation(goodchar.getLocation().x, goodchar.getLocation().y + 32);
                f.setX(f.getX()+1);
                flag=1;
                }
                else
                    System.out.println("hatali yon");
                break;
                
            case KeyEvent.VK_RIGHT:
                try {
                a = matrix[f.getX()][f.getY()+1];
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("disari cikilamaz");
                    break;
                }
                if(matrix[f.getX()][f.getY()+1]==1)
                {
                goodchar.setLocation(goodchar.getLocation().x + 32, goodchar.getLocation().y);
                f.setY(f.getY()+1);
                flag=1;
                }
                else
                System.out.println("hatali yon");
                break;
                
            case KeyEvent.VK_LEFT:
                try {
                a = matrix[f.getX()][f.getY()-1];
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("disari cikilamaz");
                    break;
                }
                if(matrix[f.getX()][f.getY()-1]==1)
                {
                goodchar.setLocation(goodchar.getLocation().x - 32, goodchar.getLocation().y);
                f.setY(f.getY()-1);
                flag=1;
                }
                else
                System.out.println("hatali yon");
                break;
                }
        
    return flag;
    }
    
    
    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        int key = evt.getKeyCode();
        int a,tmpx=1,tmpy=1;
        int flag=0;
   
        
    if(yodabutton.isSelected()){   
            
            flag = func(key,yoda);
      
                tmpx=yoda.getX();
                tmpy=yoda.getY();
                
                if(tmpx==9 && tmpy==13){
                    yoda.setX(5);
                    yoda.setY(6);
                    goodchar.setLocation(250,260);
                    JOptionPane.showMessageDialog(null, "Kazandiniz.. ", "Dikkat", -1);
                    badchar1.setIcon(null);
                    badchar2.setIcon(null);
                    badchar3.setIcon(null);
                    badchar4.setIcon(null);
                    badchar5.setIcon(null);
                    img_atama(bar);
                }
                
                }
        
    else if(skywalkerbutton.isSelected()){  
        flag = func(key,skywalker);
        
                tmpx=skywalker.getX();
                tmpy=skywalker.getY();
                
                if(tmpx==9 && tmpy==13){
                    skywalker.setX(5);
                    skywalker.setY(6);
                    goodchar.setLocation(250,260);
                    JOptionPane.showMessageDialog(null, "Kazandiniz.. ", "Dikkat", -1);
                    badchar1.setIcon(null);
                    badchar2.setIcon(null);
                    badchar3.setIcon(null);
                    badchar4.setIcon(null);
                    badchar5.setIcon(null);
                    img_atama(bar);
                }
                
        }
        
        
                
        if(stormtrooper.isSelected()&& flag==1){
            a = storm.enkisayol(tmpx*14+tmpy,storm.getX()*14+storm.getY());

            storm.setX(a/14);
            storm.setY(a%14);
           
            
            if(storm.getLabel()==1){
            badchar1.setLocation(storm.getY()*32+58,storm.getX()*32+100);
            }if(storm.getLabel()==2){
            badchar2.setLocation(storm.getY()*32+58,storm.getX()*32+100);
            }if(storm.getLabel()==3){
            badchar3.setLocation(storm.getY()*32+58,storm.getX()*32+100);
            }if(storm.getLabel()==4){
            badchar4.setLocation(storm.getY()*32+58,storm.getX()*32+100);
            }if(storm.getLabel()==5){
            badchar5.setLocation(storm.getY()*32+58,storm.getX()*32+100);
            }
            
            if(storm.getX()==tmpx && storm.getY()==tmpy){
                System.out.println("storm carpti");
                flag=2;
                }
            
            }
        
            if(kylorenn.isSelected() && flag==1){
            a = kyloren.enkisayol(tmpx*14+tmpy,kyloren.getX()*14+kyloren.getY());
          
            kyloren.setX(a/14);
            kyloren.setY(a%14);
         
            
            if(kyloren.getLabel()==1){
            badchar1.setLocation(kyloren.getY()*32+58,kyloren.getX()*32+100);
            }if(kyloren.getLabel()==2){
            badchar2.setLocation(kyloren.getY()*32+58,kyloren.getX()*32+100);
            }if(kyloren.getLabel()==3){
            badchar3.setLocation(kyloren.getY()*32+58,kyloren.getX()*32+100);
            }if(kyloren.getLabel()==4){
            badchar4.setLocation(kyloren.getY()*32+58,kyloren.getX()*32+100);
            }if(kyloren.getLabel()==5){
            badchar5.setLocation(kyloren.getY()*32+58,kyloren.getX()*32+100);
            }
            
            
            if(kyloren.getX()==tmpx && kyloren.getY()==tmpy){
                System.out.println("kyloren carpti");
                flag=2;
                }
            }
            
            
            if(darthvader.isSelected() && flag==1){

            a = darth.enkisayol(darth.getX(),darth.getY(),tmpx,tmpy);

            
            darth.setX(a/14);
            darth.setY(a%14);
            
            
            if(darth.getLabel()==1){
            badchar1.setLocation(darth.getY()*32+58,darth.getX()*32+100);
            }if(darth.getLabel()==2){
            badchar2.setLocation(darth.getY()*32+58,darth.getX()*32+100);
            }if(darth.getLabel()==3){
            badchar3.setLocation(darth.getY()*32+58,darth.getX()*32+100);
            }if(darth.getLabel()==4){
            badchar4.setLocation(darth.getY()*32+58,darth.getX()*32+100);
            }if(darth.getLabel()==5){
            badchar5.setLocation(darth.getY()*32+58,darth.getX()*32+100);
            }
            
            if(darth.getX()==tmpx && darth.getY()==tmpy){
                System.out.println("darth carpti");
                flag=2;
                }
            }
            
            if(flag==2){
                if(skywalkerbutton.isSelected()){
                    skywalker.setX(5);
                    skywalker.setY(6);
                    goodchar.setLocation(250,260);
                    skywalker.setCan(skywalker.getCan()-1);
                    progressbar.setValue(progressbar.getValue()-33);
                    if(skywalker.getCan()<1){
                      JOptionPane.showMessageDialog(null, "Game Over  "+ username.getText(), "Dikkat", -1);
                      setVisible(false); 
                      dispose(); 
                    }
                    badchar1.setIcon(null);
                    badchar2.setIcon(null);
                    badchar3.setIcon(null);
                    badchar4.setIcon(null);
                    badchar5.setIcon(null);
                    img_atama(bar);
                    }else if(yodabutton.isSelected()){
                    yoda.setX(5);
                    yoda.setY(6);
                    goodchar.setLocation(250,260);
                    yoda.setCan(yoda.getCan()-1);
                    progressbar.setValue(progressbar.getValue()-17);
                    if(yoda.getCan()<1){
                      JOptionPane.showMessageDialog(null, "Game Over  " + username.getText(), "Dikkat", -1);
                      setVisible(false); 
                      dispose(); 
                    }
                    badchar1.setIcon(null);
                    badchar2.setIcon(null);
                    badchar3.setIcon(null);
                    badchar4.setIcon(null);
                    badchar5.setIcon(null);
                    img_atama(bar);
                    }   
            }
            
            
    }//GEN-LAST:event_jPanel2KeyPressed


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel badchar1;
    private javax.swing.JLabel badchar2;
    private javax.swing.JLabel badchar3;
    private javax.swing.JLabel badchar4;
    private javax.swing.JLabel badchar5;
    private javax.swing.JLabel badchar6;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JRadioButton darthvader;
    private javax.swing.JLabel darthvaderpng;
    private javax.swing.JLabel goodchar;
    private javax.swing.JLabel health;
    public static javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JRadioButton kylorenn;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JRadioButton skywalkerbutton;
    private javax.swing.JLabel skywalkericon;
    public static javax.swing.JRadioButton stormtrooper;
    private javax.swing.JLabel stormtrooperpng;
    private javax.swing.JTextField username;
    public static javax.swing.JRadioButton yodabutton;
    private javax.swing.JLabel yodaicon;
    // End of variables declaration//GEN-END:variables
}
