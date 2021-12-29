import javax.swing.JOptionPane;
public class NewJFrame extends javax.swing.JFrame {
int s1,s2,s3,islem,sonuc;
 private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
        jLabel1.setText("-");
islem = 1;
       }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
jLabel1.setText("X");
islem = 2;
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
        jLabel1.setText("+");
islem = 0;
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
 
jLabel1.setText("/");
islem = 3;
    // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        s1 = Integer.parseInt(jTextField1.getText());
        s2 = Integer.parseInt(jTextField3.getText());
        
        jTextField1.setText("");
        jTextField3.setText("");
        if(islem ==0) {
            sonuc =  s1+s2;
          jTextField2.setText(String.valueOf(sonuc));
        }
        else if(islem ==1) {
            sonuc =  s1-s2;
          jTextField2.setText(String.valueOf(sonuc));
        }
        else if(islem ==2) {
            sonuc =  s1*s2;
          jTextField2.setText(String.valueOf(sonuc));
        }
        else if(islem ==3) {
            sonuc =  s1/s2;
          jTextField2.setText(String.valueOf(sonuc));   
        }
        JOptionPane.showMessageDialog(this, "İşlemniz yapıldı");
            
    }                                        
