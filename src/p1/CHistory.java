/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
import java.sql.ResultSet; 
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static p1.cnn.cn;
/**
 *
 * @author YaneeSE
 */
public class CHistory extends javax.swing.JFrame {
public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
    public CHistory() {
       initComponents(); 
        
         String colum[] = { "RegisterID", "Name", "Course"};
         String data[][]= {null, null, null}; 

     jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null,},
                {null, null, null, },
                {null, null, null, },
                {null, null, null, }
            },
            new String [] {
                "RegisterID", "Name", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        ResultSet rs = cn().executeQuery("select * from register");

    // It creates and displays the table
    JTable table = new JTable(buildTableModel(rs));

    // Closes the Connection

    JOptionPane.showMessageDialog(null, new JScrollPane(table));
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    Object[][] data(){
    Object a[][] = new String[5][4];
     
    
    try {   
          
            ResultSet rs = cn().executeQuery("SELECT * FROM user where u_id="+uuid); 
            
            while(rs.next()) {
                 name = rs.getString("u_name");
                 tel  = rs.getString("u_tel");
                 age  = rs.getString("u_age");
                 type = rs.getString("u_type");
                 //System.out.println(name ); 
             }
             
        } catch (Exception ex) {
            System.err.println("error conect.");
        }   
    
        return a;
    }
    
    String name , age , tel , type ;
    String uuid = "000000001";
    
    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
