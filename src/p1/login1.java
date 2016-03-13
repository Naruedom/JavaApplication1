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
        pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ระบบจัดการสระว่ายน้ำ");
        setBackground(new java.awt.Color(187, 203, 252));
        setForeground(new java.awt.Color(153, 153, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });
        getContentPane().add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 155, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 315, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("รหัสพนักงาน  ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        Error.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Error.setForeground(new java.awt.Color(255, 0, 0));
        Error.setText("Error.");
        getContentPane().add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("เข้าสู่ระบบ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 70));

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
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 155, 32));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("รหัสผ่าน       ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DRAFT\\Documents\\NetBeansProjects\\JavaApplication1\\src\\p1\\img\\bgin.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 1110, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 150));

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
