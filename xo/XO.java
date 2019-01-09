
package xo;
import java.awt.Rectangle;
import javax.swing.JOptionPane;
public class XO extends javax.swing.JFrame {
String[] setPlay;
int i;
int status,y,confrm,x,scores;
String player1,player2,tt;
int j;
boolean k;

    public XO() {

      setPlay=new String[9];
      y=0;
        initComponents();
          jButton13.setEnabled(false);
          jButton15.setEnabled(false);
          jButton14.setEnabled(false);
          jButton3.setEnabled(false);
          jButton18.setEnabled(false);
          jButton5.setEnabled(false);
          jButton12.setEnabled(false);
          jButton17.setEnabled(false);
          jButton16.setEnabled(false);
           jButton6.setEnabled(false);
           jButton4.setEnabled(false);
      }
    private void startOver(){
        setPlay=new String[9];
         y=0;
          jButton13.setEnabled(true);
          jButton15.setEnabled(true);
          jButton14.setEnabled(true);
          jButton3.setEnabled(true);
          jButton18.setEnabled(true);
          jButton5.setEnabled(true);
          jButton12.setEnabled(true);
          jButton17.setEnabled(true);
          jButton16.setEnabled(true);
          
          jButton13.setText("");
          jButton14.setText("");
          jButton15.setText("");
          jButton16.setText("");
          jButton17.setText("");
          jButton18.setText("");
          jButton3.setText("");
          jButton12.setText("");
          jButton5.setText("");
    }
    private void check() {
     if(x==1){
      if((y%2)==0){
      scores=Integer.parseInt(jTextField1.getText());
      scores+=1;
      jTextField1.setText(""+scores);
      }
     else{
      scores=Integer.parseInt(jTextField2.getText());
      scores+=1;
      jTextField2.setText(""+scores);
      }
      status=1;
      confrm=JOptionPane.showConfirmDialog(rootPane, "DO YOU WANT TO CONTINUE?","REQUEST", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 if(confrm==JOptionPane.YES_OPTION){
        startOver();
        x=0;
    }else{
 this.dispose();
 new XO().setVisible(true);
 }
     }
    } 
    private void disab(){
              x=1;
          JOptionPane.showMessageDialog(rootPane,"<html><font size=\"100\">'"+setPlay[y]+"' won!!!" ,"X&O", JOptionPane.PLAIN_MESSAGE);
          if(setPlay[y].equalsIgnoreCase("O")){
          k=false;
          }else{
           k=true;
          }
          
          jButton13.setEnabled(false);
          jButton14.setEnabled(false);
          jButton3.setEnabled(false);
          jButton18.setEnabled(false);
          jButton5.setEnabled(false);
          jButton12.setEnabled(false);
          jButton17.setEnabled(false);
          jButton16.setEnabled(false);
          jButton15.setEnabled(false);
          status=0;
    }
    private void play(){
        if(k==false){
        setPlay[y]="O";
        if((y%2)==0)setPlay[y]="X";
        }else{
        setPlay[y]="X";
        if((y%2)==0)setPlay[y]="O";
        }
    }
    private void btnSet(){
    if((setPlay.length-1)==y){
    if(x==0){
 confrm=JOptionPane.showConfirmDialog(rootPane, "Game DRAW!!!  DO YOU WANT TO CONTINUE?","REQUEST", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
 if(confrm==JOptionPane.YES_OPTION){
     k=!k;
     startOver();
     y-=1;
 }else{
 this.dispose();
 new XO().setVisible(true);
 }
    }
}
    y+=1;
}
   /* private void thinking(){
        for(int x=0; x<=6; x++){
    try{
        Thread.sleep(250);
        if (x<=1){
        tt="Thinking .";
        }else if ((x>1)&&(x<=3)){
        tt="Thinking ..";
        }else if ((x>3)&&(x<=5)){
        tt="Thinking ...";
        }
        else{
         tt=" ";
        }
        }catch(InterruptedException ie)
            {
      JOptionPane.showMessageDialog(null,"COMPUTER YET TO PLAY","INTERRUPT"+ie,JOptionPane.INFORMATION_MESSAGE); 
      //return;
            }
             jLabel7.setText(tt);
    //return;
        }
    }*/
    public  static void  thinking(){
  String str="thinking";
for(int i=1; i<4;i++){
  try{
  Thread.sleep(125);
  if(i<4){
      str+='.';
  Rectangle rect=jLabel7.getBounds();
  jLabel7.setText(str);
  rect.x=0;
  rect.y=0;
  //jLabel6.paintImmediately(rect);
  //jProgressBar1.setValue(i);
  //Rectangle pr=jProgressBar1.getBounds();
 // pr.x=0;
 // pr.y=0;
 // jProgressBar1.paintImmediately(pr);
  }
  
  }catch(InterruptedException ie) { 
ie.printStackTrace();    
}
}
str="";
jLabel7.setText(str);
}
    private void finalSet(){
    if(jButton12.isEnabled()){
      jButton12.setText(setPlay[y]);   
    }else if(jButton5.isEnabled()){
      jButton5.setText(setPlay[y]);   
    }else if(jButton3.isEnabled()){
      jButton3.setText(setPlay[y]);   
    }else if(jButton15.isEnabled()){
      jButton15.setText(setPlay[y]);   
    }else if(jButton16.isEnabled()){
      jButton16.setText(setPlay[y]);   
    }else if(jButton17.isEnabled()){
      jButton17.setText(setPlay[y]);   
    }else if(jButton14.isEnabled()){
      jButton14.setText(setPlay[y]);   
    }else if(jButton18.isEnabled()){
      jButton18.setText(setPlay[y]);   
    }else{
     jButton13.setText(setPlay[y]);   
    }        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(102, 255, 255));

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Adobe Arabic", 1, 80)); // NOI18N
        jLabel1.setText("X&O");
        jLabel1.setBounds(160, 10, 264, 70);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(70, 80, 350, 2);
        jLayeredPane1.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jButton15.setBounds(10, 120, 71, 87);
        jLayeredPane1.add(jButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton13.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.setBounds(100, 120, 71, 87);
        jLayeredPane1.add(jButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton14.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jButton14.setBounds(190, 120, 71, 87);
        jLayeredPane1.add(jButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(10, 210, 71, 87);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(100, 210, 71, 87);
        jLayeredPane1.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(190, 210, 71, 87);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jButton18.setBounds(10, 300, 71, 87);
        jLayeredPane1.add(jButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jButton16.setBounds(100, 300, 71, 87);
        jLayeredPane1.add(jButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jButton17.setBounds(190, 300, 71, 87);
        jLayeredPane1.add(jButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setBounds(10, 410, 115, 27);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PLAY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("START OVER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("PLAY NEW");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Player1");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("(X)");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setText("0");
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("VS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Player2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("(O)");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setText("0");
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(51, 51, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("CONTROL");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 28, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38))
        );

        jPanel1.setBounds(300, 90, 220, 340);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setBounds(0, 320, 470, 80);
        jLayeredPane2.add(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 268, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 269, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 231, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 231, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        btn16();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
            thinking();
            if((jButton13.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn13();
            }else if((jButton12.isEnabled())&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton18.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else if((jButton17.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else if((jButton13.isEnabled())&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn13();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        btn17();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
            thinking();
            if((jButton14.isEnabled())&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else if((jButton5.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn5();
            }else if((jButton15.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton12.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton16.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn16();
            }else if((jButton18.isEnabled())&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else if((jButton14.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        btn15();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
            thinking();
            if(jButton3.isEnabled()&&(jButton18.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn3();
            }else if(jButton18.isEnabled()&&(jButton3.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn18();
            }else if(jButton13.isEnabled()&&(jButton14.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn13();
            }else if(jButton14.isEnabled()&&(jButton13.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn14();
            }else if(jButton12.isEnabled()&&(jButton17.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn12();
            }else if(jButton17.isEnabled()&&(jButton12.getText().equalsIgnoreCase(setPlay[y-1]))&&(jButton15.getText()).equalsIgnoreCase(setPlay[y-1])){
                btn17();
            }else if(jButton3.isEnabled()&&(jButton15.getText().equalsIgnoreCase(setPlay[y-1]))){
                btn3();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        btn14();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton12.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton18.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else if((jButton17.isEnabled())&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else if((jButton5.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn5();
            }else if((jButton15.isEnabled())&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton13.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn13();
            }else if((jButton18.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        btn13();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton15.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton14.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else if((jButton16.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn16();
            }else if((jButton12.isEnabled())&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton15.isEnabled())&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        btn12();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton16.isEnabled())&&((jButton13.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn16();
            }else if((jButton13.isEnabled())&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn13();
            }else if((jButton14.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else if((jButton18.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else if((jButton17.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else if((jButton15.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton3.isEnabled())&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn3();
            }else if((jButton5.isEnabled())&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn5();
            }else if((jButton16.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        btn5();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton14.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else if((jButton17.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else if((jButton12.isEnabled())&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton3.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn3();
            }else if((jButton17.isEnabled())&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        btn3();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton18.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn18();
            }else if((jButton15.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton12.isEnabled())&&((jButton5.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton5.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn5();
            }else if((jButton15.isEnabled())&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        confrm=JOptionPane.showConfirmDialog(null,"Are You Sure? You Are Abt To Start New Game","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confrm==JOptionPane.YES_OPTION){
            jLabel2.setText("Player1");
            jLabel3.setText("Player2");
            jTextField1.setText("0");
            jTextField2.setText("0");
            playGame();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        startOver();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        btn18();
        if(y>0){
        if(jLabel3.getText().equalsIgnoreCase("COMPUTER")){
               thinking();
            if((jButton12.isEnabled())&&((jButton14.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else if((jButton14.isEnabled())&&((jButton12.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn14();
            }else if((jButton16.isEnabled())&&((jButton17.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn16();
            }else if((jButton17.isEnabled())&&((jButton16.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn17();
            }else if((jButton3.isEnabled())&&((jButton15.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn3();
            }else if((jButton15.isEnabled())&&((jButton3.getText()).equalsIgnoreCase(setPlay[y-1]))&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn15();
            }else if((jButton12.isEnabled())&&((jButton18.getText()).equalsIgnoreCase(setPlay[y-1]))){
                btn12();
            }else{
            finalSet();
            }
        }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        playGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        confrm=JOptionPane.showConfirmDialog(rootPane,"Are you sure you want to exit\n All games will be reset?","NOTICE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confrm==0)
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void btn15(){
         play();
        jButton15.setText(setPlay[y]);
        jButton15.setEnabled(false);
        if((jButton15.getText().equalsIgnoreCase(jButton13.getText())&&jButton15.getText().equalsIgnoreCase(jButton14.getText()))
      ||(jButton15.getText().equalsIgnoreCase(jButton3.getText())&&jButton15.getText().equalsIgnoreCase(jButton18.getText()))
      ||(jButton15.getText().equalsIgnoreCase(jButton12.getText())&&jButton15.getText().equalsIgnoreCase(jButton17.getText())))   
      {
          disab();
          check();
         }
        else{
        btnSet();
       }
    
    }    private void btn13(){
        play();
        jButton13.setText(setPlay[y]);
        jButton13.setEnabled(false);
      if((jButton15.getText().equalsIgnoreCase(jButton13.getText())&&jButton15.getText().equalsIgnoreCase(jButton14.getText()))
      ||(jButton13.getText().equalsIgnoreCase(jButton12.getText())&&jButton13.getText().equalsIgnoreCase(jButton16.getText())))   
      {
        disab();
        check();
      }
       else{
        btnSet();
       }
    }    private void btn14(){
    play();
        jButton14.setText(setPlay[y]);
       jButton14.setEnabled(false);
       if((jButton15.getText().equalsIgnoreCase(jButton13.getText())&&jButton15.getText().equalsIgnoreCase(jButton14.getText()))
      ||(jButton14.getText().equalsIgnoreCase(jButton5.getText())&&jButton14.getText().equalsIgnoreCase(jButton17.getText()))
      ||(jButton12.getText().equalsIgnoreCase(jButton18.getText())&&jButton12.getText().equalsIgnoreCase(jButton14.getText())))   
      {
          disab();
          check();
      }else{
        btnSet();
       }
    }    private void btn3(){
    play();
        jButton3.setText(setPlay[y]);
       jButton3.setEnabled(false);
       if((jButton15.getText().equalsIgnoreCase(jButton3.getText())&&jButton15.getText().equalsIgnoreCase(jButton18.getText()))
      ||(jButton3.getText().equalsIgnoreCase(jButton12.getText())&&jButton5.getText().equalsIgnoreCase(jButton3.getText())))   
      {
          disab();
          check();
         
      }
        else{
        btnSet();
       }
    }    private void btn12(){
     play();
        jButton12.setText(setPlay[y]);
        jButton12.setEnabled(false);
        if((jButton15.getText().equalsIgnoreCase(jButton12.getText())&&jButton15.getText().equalsIgnoreCase(jButton17.getText()))
      ||(jButton13.getText().equalsIgnoreCase(jButton12.getText())&&jButton13.getText().equalsIgnoreCase(jButton16.getText()))
      ||(jButton3.getText().equalsIgnoreCase(jButton12.getText())&&jButton5.getText().equalsIgnoreCase(jButton3.getText()))
      ||(jButton12.getText().equalsIgnoreCase(jButton18.getText())&&jButton12.getText().equalsIgnoreCase(jButton14.getText())))   
      {
          disab();
          check();
          
      }
         else{
        btnSet();
       }
      
    }    private void btn5(){
    play();
         jButton5.setText(setPlay[y]);
       jButton5.setEnabled(false);
       if((jButton14.getText().equalsIgnoreCase(jButton5.getText())&&jButton14.getText().equalsIgnoreCase(jButton17.getText()))
      ||(jButton3.getText().equalsIgnoreCase(jButton12.getText())&&jButton5.getText().equalsIgnoreCase(jButton3.getText())))   
      {
          disab();
          check();
         
      }
       else{
        btnSet();
       }
        
    }    private void btn18(){
    play();
        jButton18.setText(setPlay[y]);
        jButton18.setEnabled(false);
        if((jButton15.getText().equalsIgnoreCase(jButton3.getText())&&jButton15.getText().equalsIgnoreCase(jButton18.getText()))
      ||(jButton12.getText().equalsIgnoreCase(jButton18.getText())&&jButton12.getText().equalsIgnoreCase(jButton14.getText()))
      ||(jButton18.getText().equalsIgnoreCase(jButton16.getText())&&jButton16.getText().equalsIgnoreCase(jButton17.getText())))   
      {
          disab();
          check();
         
      }
         else{
        btnSet();
       }
        
    }    private void btn16(){
    play();
        jButton16.setText(setPlay[y]);
      jButton16.setEnabled(false);
      if((jButton13.getText().equalsIgnoreCase(jButton12.getText())&&jButton13.getText().equalsIgnoreCase(jButton16.getText()))
      ||(jButton18.getText().equalsIgnoreCase(jButton16.getText())&&jButton16.getText().equalsIgnoreCase(jButton17.getText())))   
      {
         disab();
         check();
    }
       else{
        btnSet();
       }
        
    }    private void btn17(){
    play();
        jButton17.setText(setPlay[y]);
       jButton17.setEnabled(false);
 if((jButton15.getText().equalsIgnoreCase(jButton12.getText())&&jButton15.getText().equalsIgnoreCase(jButton17.getText()))
      ||(jButton14.getText().equalsIgnoreCase(jButton5.getText())&&jButton14.getText().equalsIgnoreCase(jButton17.getText()))
      ||(jButton18.getText().equalsIgnoreCase(jButton16.getText())&&jButton16.getText().equalsIgnoreCase(jButton17.getText())))   
      {
          disab();
          check();
      }
       else{
        btnSet();
       }
        
    }    private void playGame(){
        player1="";
        player2="";
    confrm=JOptionPane.showConfirmDialog(null,"Play with computer?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confrm==JOptionPane.YES_OPTION){
            player1=JOptionPane.showInputDialog(null,"ENTER YOUR NAME","REQUEST",JOptionPane.QUESTION_MESSAGE);
            player2="COMPUTER";
            }else{
            player1=JOptionPane.showInputDialog(null,"ENTER YOUR NAME","PLAYER1",JOptionPane.QUESTION_MESSAGE);
            player2=JOptionPane.showInputDialog(null,"ENTER YOUR NAME","PLAYER2",JOptionPane.QUESTION_MESSAGE);
        }
           try{ 
            if(player1.equalsIgnoreCase("")){
                player1="Player1";
            confrm=JOptionPane.showConfirmDialog(null,"Player1! Are You Sure You Don't \n Want to Set Name?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confrm==JOptionPane.NO_OPTION)playGame();
            }
            
            if(player2.equalsIgnoreCase("")){
                player2="Player2";
            confrm=JOptionPane.showConfirmDialog(null,"Player2! Are You Sure You Don't \n Want to Set Name?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(confrm==JOptionPane.NO_OPTION)playGame();
            }
           }catch(NullPointerException npe)
           {
           JOptionPane.showMessageDialog(null,"No Name Set","PLAYERS INFO",JOptionPane.INFORMATION_MESSAGE);
           player1="Player1";
           player2="Player2";
           }
        jLabel2.setText(player1);
        jLabel3.setText(player2);
        jButton13.setEnabled(true);
          jButton15.setEnabled(true);
          jButton14.setEnabled(true);
          jButton3.setEnabled(true);
          jButton18.setEnabled(true);
          jButton5.setEnabled(true);
          jButton12.setEnabled(true);
          jButton17.setEnabled(true);
          jButton16.setEnabled(true);
          jButton2.setEnabled(false);
          jButton16.setEnabled(true);
          jButton4.setEnabled(true);
          jButton6.setEnabled(true);
          jButton13.setText("");
          jButton14.setText("");
          jButton15.setText("");
          jButton16.setText("");
          jButton17.setText("");
          jButton18.setText("");
          jButton3.setText("");
          jButton12.setText("");
          jButton5.setText("");
    }
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
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
