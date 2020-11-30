/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author INDUWARA
 */
public class RepairGUI extends javax.swing.JFrame {

    /**
     * Creates new form RepairGUI
     */


    public RepairGUI() {
        initComponents();
    }
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url ="jdbc:sqlserver://INDUWARAADITHYA\\PANCHALI:1433;databaseName=projtu6";
        String user="root";
        String password="password";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJobId = new javax.swing.JTextField();
        txtVID = new javax.swing.JTextField();
        txtEID = new javax.swing.JTextField();
        txtWCost = new javax.swing.JTextField();
        AddBtnRepair = new javax.swing.JButton();
        updateBtnRepair = new javax.swing.JButton();
        deleteRepairJob = new javax.swing.JButton();
        BtnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Repair Job");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("JOBID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VehicleID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Work cost");

        AddBtnRepair.setText("Add vehicle to Repair job");
        AddBtnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnRepairActionPerformed(evt);
            }
        });

        updateBtnRepair.setForeground(new java.awt.Color(255, 0, 51));
        updateBtnRepair.setText("Update Repair job");
        updateBtnRepair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnRepairActionPerformed(evt);
            }
        });

        deleteRepairJob.setBackground(new java.awt.Color(255, 0, 0));
        deleteRepairJob.setText("delete Repair job");
        deleteRepairJob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRepairJobActionPerformed(evt);
            }
        });

        BtnClose.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnClose.setForeground(new java.awt.Color(255, 51, 51));
        BtnClose.setText("X");
        BtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
                        .addComponent(BtnClose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(AddBtnRepair)
                            .addComponent(updateBtnRepair))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJobId)
                                    .addComponent(txtVID)
                                    .addComponent(txtEID)
                                    .addComponent(txtWCost, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(deleteRepairJob)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BtnClose))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtVID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtWCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(AddBtnRepair)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtnRepair)
                    .addComponent(deleteRepairJob))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnRepairActionPerformed
       try{
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url, user, password);
        String sql="insert into Repair "
                +"(JobID,VID,EID,WCost)"
                +"values(?,?,?,?)";
        String sql2="select * from Repair";
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,txtJobId.getText() );
        pst.setString(2, txtVID.getText());
        pst.setString(3,txtEID.getText());
        pst.setString(4, txtWCost.getText());
     
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Vehicle Added to Repair job Successfully");
        
            PreparedStatement pst2=con.prepareStatement(sql2);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnRepairActionPerformed

    private void updateBtnRepairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnRepairActionPerformed
         try{
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url, user, password);
        String sql="update Repair set VID=?,EID=?,WCost=? where JobID=? ";
        String sql2="select * from Repair";

        PreparedStatement pst=con.prepareStatement(sql);
   
        pst.setString(1, txtVID.getText());
        pst.setString(2,txtEID.getText());
        pst.setString(3, txtWCost.getText());
        pst.setString(4, txtJobId.getText());
   
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Vehicle Repair job updated Successfully");
        
        PreparedStatement pst2=con.prepareStatement(sql2);
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        
    }
       
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnRepairActionPerformed

    private void deleteRepairJobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRepairJobActionPerformed
     try{
        Class.forName(driver);
        Connection con=DriverManager.getConnection(url, user, password);
        String sql="delete from Repair where JobID=? ";

        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1,txtJobId.getText() );

     
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Vehicle Repair job deleted Successfully");
        
        
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRepairJobActionPerformed

    private void BtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseActionPerformed
        MainFrame mf=new MainFrame();
        mf.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RepairGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RepairGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RepairGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RepairGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RepairGUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtnRepair;
    private javax.swing.JButton BtnClose;
    private javax.swing.JButton deleteRepairJob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEID;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtVID;
    private javax.swing.JTextField txtWCost;
    private javax.swing.JButton updateBtnRepair;
    // End of variables declaration//GEN-END:variables
}
