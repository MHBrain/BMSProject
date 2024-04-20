/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// the Ingredients page displays the ingredients information in a table, and allows the user to access the IngredientAdd and IngredientUpdate page.

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Max
 */
public class Ingredients extends javax.swing.JFrame {

    /**
     * Creates new form Ingredients
     */
    public Ingredients() {
        initComponents();
        updateTable();
    }
    
    public void updateTable() {
        //this method occupies the table with data retrieved from the database
        DefaultTableModel model = (DefaultTableModel) jtblIngredients.getModel(); //defaulttablemodel so i can add rows
        model.setRowCount(0); //clear table of previous values (for refresh) 

    String query = "SELECT * FROM tblIngredients";
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://computing.gfmat.org:3306/BMSProject", "MBrain", "hkFfdZ2X3N"); //make connection to database
             PreparedStatement pstmt = conn.prepareStatement(query); //prevent SQL injection
             ResultSet rs = pstmt.executeQuery()) { //data from database

            String[] columnNames = {"IngredientID", "IngredientName", "IngredientQuantity", "SupplierID", "UnitCost", "NeedsReorder"}; //create array of strings to set in table
            model.setColumnIdentifiers(columnNames); //defines column identifiers

            while (rs.next()) { //iterate through resultset
                Object[] row = { //create array for column data
                    rs.getInt("IngredientID"),
                    rs.getString("IngredientName"),
                    rs.getInt("IngredientQuantity"),
                    rs.getInt("SupplierID"),
                    rs.getBigDecimal("UnitCost"),
                    rs.getBoolean("NeedsReorder")
                    //populate array with data
                };
                model.addRow(row); //add array as row
            }
            
        } catch (SQLException e) {
        	System.out.println("Database Error: " + e.getMessage()); //display error msg
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        lblIngredientManagement = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblIngredients = new javax.swing.JTable();
        btnAddIng = new javax.swing.JButton();
        btnUpdIng = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        lblIngredientManagement.setText("Ingredient Management");

        jtblIngredients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Quantity", "Supplier ID", "Unit Cost", "Reorder?"
            }
        ));
        jScrollPane1.setViewportView(jtblIngredients);

        btnAddIng.setText("Add Ingredient");
        btnAddIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngActionPerformed(evt);
            }
        });

        btnUpdIng.setText("Update Ingredient");
        btnUpdIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdIngActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnHome)
                        .addGap(64, 64, 64)
                        .addComponent(lblIngredientManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAddIng)
                        .addGap(63, 63, 63)
                        .addComponent(btnUpdIng)
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome)
                    .addComponent(lblIngredientManagement)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddIng)
                    .addComponent(btnUpdIng))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAddIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddIngActionPerformed
        // TODO add your handling code here:
        new IngredientAdd().setVisible(true);
    }//GEN-LAST:event_btnAddIngActionPerformed

    private void btnUpdIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdIngActionPerformed
        // TODO add your handling code here:
        new IngredientUpdate().setVisible(true);
    }//GEN-LAST:event_btnUpdIngActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        updateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Ingredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingredients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddIng;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdIng;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblIngredients;
    private javax.swing.JLabel lblIngredientManagement;
    // End of variables declaration//GEN-END:variables
}
