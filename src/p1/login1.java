package p1;
 
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException; 
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import static p1.cnn.Select;

public class login1 extends javax.swing.JFrame {

    public login1() {
        initComponents(); 
        Error.setText("");
        URL iconURL = getClass().getResource("pool.png"); 
        ImageIcon icon = new ImageIcon(iconURL);
         this.setIconImage(icon.getImage());
           }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        User = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบจัดการสระว่ายน้ำ");
        setResizable(false);

        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("รหัสพนักงาน :");

        Error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setText("Error.");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("เข้าสู่ระบบ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("รหัสผ่าน      :");

        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Error)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(pass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Error)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Error.setText(""); 
        String id   = User.getText();
        String Pass = pass.getText();
        if(id.equals("")){
            Error.setText("ใส่รหัสพนักงาน !");
            return;
        }  
        else if(Pass.equals("")){
            Error.setText("ใส่รหัสผ่าน !");
            return;
        }  
        try {
            ResultSet rs = Select("SELECT * FROM `staff` where sf_id ='"+id+"'");
            if(rs.next()){  
                
                String status = rs.getString("sf_status") ;
                String pass = rs.getString("sf_pass") ;
                
                if(!pass.equals(Pass))
                {
                    Error.setText("รหัสผ่านไม่ถูกต้อง !"); 
                    return;
                }
                
                //System.out.println(status);
                if("cashier".equals(status) ) 
                { 
                login1 = new login(id ); 
                goStaff();
                }
                else if("admin".equals(status) ) 
                { 
                login1 = new login(id ); 
                goAdmin();
                }
                else
                {
                login1 = new login(id );  
                goTrainer();
                } 
                
                
                
            }  else {  Error.setText("รหัสพนักงานไม่ถูกต้อง"); }
             
           
                
        } catch (Exception e) { System.err.println("error");  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
       Error.setText(""); 
    }//GEN-LAST:event_UserMouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        Error.setText(""); 
    }//GEN-LAST:event_passMouseClicked

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                 try 
    { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
    } 
    catch(Exception e){ 
    }
                new login1().setVisible(true);
            }
        });
    }
     void goTrainer() throws SQLException{
             Trainer gui = new Trainer();
             gui.add(login1);
             this.setVisible(false); 
             gui.setVisible(true); 
             //System.out.println( login1.getName() ); 
    }
    
     void goStaff() throws SQLException{ 
             Staff gui = new Staff();
             gui.add(login1);
             this.setVisible(false); 
             gui.setVisible(true);  
           // System.out.println( login1.getName() );  
    }
     
      void goAdmin() throws SQLException{ 
             Admin gui = new Admin();
             gui.add(login1);
             this.setVisible(false); 
             gui.setVisible(true);  
           // System.out.println( login1.getName() );  
    }
    
        login login1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Error;
    private javax.swing.JTextField User;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
