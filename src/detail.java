import java.util.*;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anish
 */
public class detail extends javax.swing.JFrame {
    static double bill;
    static int a[],rooms;
    static Date date1,date2;
    static int t;
    
    
    /**
     * Creates new form detail
     */
    
    public detail(int r,Date d1,Date d2,int arr[],double b,int t) {
        a=arr;
        rooms=r;
        date1=d1;
        date2=d2;
        bill=b;
        this.t=t;
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(819, 425));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 30)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel2.setText(" NAME:");

        jTextField1.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel5.setText("CONTACT NUMBER:");

        jTextField3.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel6.setText("EMAIL ID:");

        jTextField4.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jButton1.setText("PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 22)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 28)); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel3))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton2)
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(63, 63, 63)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name=jTextField1.getText();
        String contactno=jTextField3.getText();
        String emailid=jTextField4.getText();
        if(name==""||contactno==""||emailid=="")
        {
            JOptionPane.showMessageDialog(null, "All fields are compulsory");
        }
        else
        {
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try {
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
                    Statement st= con.createStatement();
                    ResultSet rs= st.executeQuery("select * from unoccupiedrooms order by occount");
                    int k=1;
                    int num=0,n1=0;
                    while(rs.next())
                    {
                        num =rs.getInt("RoomNumber");
                        n1= rs.getInt("occount");
                        int m=num/100;
                        int n=num%10;
                        if(t==0)
                        {
                        if(a[4*m -5 +n]==0 && (4*m-5+n)<12)
                            {
                            PreparedStatement stmt=con.prepareStatement("insert into occrooms values(?,?,?,?,?,?,?,?,?,?,?,?)");
                            stmt.setInt(1, num);
                            String type="Studio";
                            stmt.setString(2, type);
                            java.sql.Date d1= new java.sql.Date(date1.getTime());
                            stmt.setDate(3, d1);
                            java.sql.Date d2= new java.sql.Date(date2.getTime());
                            stmt.setDate(4, d2);
                            stmt.setInt(5, (int)bill);
                            stmt.setInt(6, 0);
                            stmt.setString(7, name);
                            n1=n1+1;
                            stmt.setString(8, name.substring(0,1)+num+n1);
                            stmt.setInt(9, 0);
                            stmt.setInt(10, 0);
                            stmt.setInt(11, 0);
                            stmt.setInt(12, 0);
                            int i=stmt.executeUpdate();
                            a[4*m -5 +n]=1;
                            stmt=con.prepareStatement("insert into customers values(?,?,?,?,?,?)");
                            stmt.setString(1, name);
                            stmt.setString(2, contactno);
                            stmt.setString(3, emailid);
                            stmt.setInt(4, num);
                            stmt.setDouble(5, bill);
                            stmt.setString(6, name.substring(0, 1)+num+n1);
                            stmt.executeUpdate();
                            stmt=con.prepareStatement("update unoccupiedrooms set occount = ? where roomnumber=?");
                            stmt.setInt(1, n1);
                            stmt.setInt(2, num);
                            stmt.executeUpdate();
                            k=0;
                        }
                        }
                        else
                        {
                             if(a[4*m -5 +n]==0 && (4*m-5+n)>=12)
                        {
                            PreparedStatement stmt=con.prepareStatement("insert into occrooms values(?,?,?,?,?,?,?,?,?,?,?,?)");
                            stmt.setInt(1, num);
                            String type="Studio";
                            stmt.setString(2, type);
                            java.sql.Date d1= new java.sql.Date(date1.getTime());
                            stmt.setDate(3, d1);
                            java.sql.Date d2= new java.sql.Date(date2.getTime());
                            stmt.setDate(4, d2);
                            stmt.setInt(5,(int)bill);
                            stmt.setInt(6, 0);
                            stmt.setString(7, name);
                            n1=n1+1;
                            stmt.setString(8, name.substring(0,1)+num+n1);
                             stmt.setInt(9, 0);
                            stmt.setInt(10, 0);
                            stmt.setInt(11, 0);
                            stmt.setInt(12, 0);
                            int i=stmt.executeUpdate();
                            
                            a[4*m -5 +n]=1;
                            stmt=con.prepareStatement("insert into customers values(?,?,?,?,?,?)");
                            stmt.setString(1, name);
                            stmt.setString(2, contactno);
                            stmt.setString(3, emailid);
                            stmt.setInt(4, num);
                            stmt.setInt(5, (int)bill);
                            stmt.setString(6, name.substring(0, 1)+num+n1);
                            stmt.executeUpdate();
                            stmt=con.prepareStatement("update unoccupiedrooms set occount = ? where roomnumber=?");
                            stmt.setInt(1, n1);
                            stmt.setInt(2, num);
                            stmt.executeUpdate();
                            k=0;
                        }
                        }
                        if(k==0)
                        {
                            break;
                        }
                        
                    }
                    JOptionPane.showMessageDialog(null, "Your room has been successfully booked\nYour room number is :"+num+"\nYour password is : "+name.substring(0, 1)+num+n1);
                    setVisible(false);
                } catch (SQLException ex) {
                    Logger.getLogger(detail.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(detail.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Bookings b=new Bookings();
        b.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detail(rooms,date1,date2,a,bill,t).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}