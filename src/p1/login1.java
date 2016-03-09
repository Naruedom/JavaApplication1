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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ระบบจัดการสระว่ายน้ำ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Error)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Error)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Error.setText(""); 
        String id = User.getText();
        if(id.equals("")){
            Error.setText("ใส่รหัสพนักงาน !");
            return;
        }  
        try {
            ResultSet rs = Select("SELECT * FROM `staff` where sf_id ='"+id+"'");
            if(rs.next()){  
                
                String status = rs.getString("sf_status") ;
                System.out.println(status);
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
    // End of variables declaration//GEN-END:variables
}
