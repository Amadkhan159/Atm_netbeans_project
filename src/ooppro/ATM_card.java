/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppro;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Amad khan
 */
public class ATM_card extends javax.swing.JFrame {
     
    /**
     * Creates new form ATM_card
     */
    
    public ATM_card() {
        setUndecorated(true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Tf2 = new javax.swing.JPasswordField();
        Tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Enterbu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lab4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setText("Wellcome to ATM");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 100, 150, 30);

        Tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf2ActionPerformed(evt);
            }
        });
        jPanel1.add(Tf2);
        Tf2.setBounds(150, 220, 240, 40);

        Tf1.setEditable(false);
        Tf1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Tf1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        Tf1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Tf1MouseMoved(evt);
            }
        });
        Tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf1ActionPerformed(evt);
            }
        });
        Tf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tf1KeyTyped(evt);
            }
        });
        jPanel1.add(Tf1);
        Tf1.setBounds(210, 90, 330, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel2.setText("Pease Enter your Credit card Number last 4-Digit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 140, 510, 40);

        Enterbu.setBackground(new java.awt.Color(0, 102, 255));
        Enterbu.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        Enterbu.setForeground(new java.awt.Color(255, 255, 255));
        Enterbu.setText("ENTER");
        Enterbu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterbuMouseClicked(evt);
            }
        });
        Enterbu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterbuActionPerformed(evt);
            }
        });
        jPanel1.add(Enterbu);
        Enterbu.setBounds(230, 270, 90, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ooppro/logo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 130, 60);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(533, 0, 60, 30);

        lab4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lab4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lab4);
        lab4.setBounds(150, 184, 240, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ooppro/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 440);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 591, 439));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Tf1ActionPerformed

    private void Tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Tf2ActionPerformed

    private void EnterbuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterbuMouseClicked
        // TODO add your handling code here:
        int cardnum=0;
        String name=null;
        boolean valid=false;
      
         Bank bank = new Bank();
         
                 
        Account a1 = new Account("Muzammil", 50000, 2223, "2020-08-16", 2369);
        Account a2 = new Account("Amad", 50000, 2623, "2023-08-20", 2589);
        Account b1 = new Account("kaala", 50000, 23, "2017-08-16", 1236);
        Account b2 = new Account("Ali", 50000, 21, "2020-08-16", 5623);
        Account b3 = new Account("MK", 50000, 2624, "2022-08-20", 8932);
         bank.addBankA(a1);
        bank.addBankA(a2);
        bank.addBankB(b1);
        bank.addBankB(b2);
        bank.addBankB(b3);
        bank.pincode(2623);
        Atm_pin g1=new Atm_pin();
        
          try{
          cardnum=Integer.parseInt(this.Tf2.getText());
          valid=true;
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(this, "Enter number 1234 Like that",
                    "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
         
        
            
        
        
        
         while(valid){
             name=bank.authorizeCardA(cardnum);
            if(name==null){
                this.setVisible(true);
                this.lab4.setText("WE HAVE NO DATA ABOUT THIS CARD");
                break;
            }
            else{
                g1.Tf3.setText(name);
        
        g1.setVisible(true);
        g1.pack();
        g1.setLocationRelativeTo(null);
        g1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        break;
        
            }
         }
        
        
        
        
        
        

        
        
        
        
    }//GEN-LAST:event_EnterbuMouseClicked

    private void EnterbuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterbuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterbuActionPerformed

    private void Tf1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tf1MouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Tf1MouseMoved

    private void Tf1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tf1KeyTyped
        // TODO add your handling code here:
        Tf1.setText("Do not Write here");
    }//GEN-LAST:event_Tf1KeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Thanks for using our Service");
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enterbu;
    private javax.swing.JTextField Tf1;
    private javax.swing.JPasswordField Tf2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab4;
    // End of variables declaration//GEN-END:variables
}
