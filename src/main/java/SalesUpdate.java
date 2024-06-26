/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//The SalesUpdate page allows the user to update or delete a sale in the database.

import java.sql.*;
import javax.swing.*;
import java.math.BigDecimal;

/**
 *
 * @author Max
 */
public class SalesUpdate extends javax.swing.JFrame {
    
    private static final String DB_URL = "jdbc:mysql://computing.gfmat.org:3306/BMSProject";
    private static final String USER = "MBrain";
    private static final String PASS = "hkFfdZ2X3N";

    /**
     *
     */
    public SalesUpdate() {
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

        lblUpdateSale = new javax.swing.JLabel();
        txtIDInput = new javax.swing.JTextField();
        btnFindItem = new javax.swing.JButton();
        lblSelectedID = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtSaleDate = new javax.swing.JTextField();
        txtSaleAmount = new javax.swing.JTextField();
        lblUpdateQuantity = new javax.swing.JLabel();
        lblUpdateDate = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JToggleButton();
        lblUpdateSaleAmount = new javax.swing.JLabel();
        lblUpdateProductID = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUpdateSale.setText("Update Sale");

        txtIDInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDInputActionPerformed(evt);
            }
        });

        btnFindItem.setText("ID Search");
        btnFindItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindItemActionPerformed(evt);
            }
        });

        lblSelectedID.setText("Currently Selected: ");

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        txtSaleDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaleDateActionPerformed(evt);
            }
        });

        txtSaleAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaleAmountActionPerformed(evt);
            }
        });

        lblUpdateQuantity.setText("Update Quantity");

        lblUpdateDate.setText("Update Date");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblUpdateSaleAmount.setText("Update SaleAmount");

        lblUpdateProductID.setText("Update ProductID");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnClose.setText("x");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFindItem)
                        .addGap(30, 30, 30)
                        .addComponent(lblSelectedID)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUpdateProductID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblUpdateQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblUpdateDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUpdateSaleAmount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(txtSaleAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUpdateSale)
                .addGap(136, 136, 136)
                .addComponent(btnClose))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnClose)
                    .addComponent(lblUpdateSale))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFindItem)
                    .addComponent(lblSelectedID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateProductID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUpdateQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdateDate)
                    .addComponent(txtSaleDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaleAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUpdateSaleAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDInputActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //this method updates the selected record to reflect the data recorded in the fields
        
        //retrieve & validate data from GUI forms using ValidationRoutines
        Integer saleId = ValidationRoutines.parseInteger(txtIDInput.getText(), "sale ID", this);
        if (saleId == null) {
            return;
        }

        Integer productId = ValidationRoutines.parseInteger(txtProductID.getText(), "product ID", this);
        if (productId == null) {
            return;
        }

        Integer quantitySold = ValidationRoutines.parseInteger(txtQuantity.getText(), "quantity sold", this);
        if (quantitySold == null || quantitySold <= 0) {
            return;
        }

        String saleDate = txtSaleDate.getText();
        if (!ValidationRoutines.isValidString(saleDate, "sale date", this)) {
            return;
        }

        BigDecimal totalSaleAmount = ValidationRoutines.parseBigDecimal(txtSaleAmount.getText(), "total sale amount", this);
        if (totalSaleAmount == null) {
            return;
        }

        String updateSaleQuery = "UPDATE tblSales SET " //make statement with placeholders
                                 + "ProductID = COALESCE(?, ProductID), " //COALESCE means fields can be left blank if nothing needs to be changed
                                 + "QuantitySold = COALESCE(?, QuantitySold), "
                                 + "SaleDate = COALESCE(?, SaleDate), "
                                 + "TotalSaleAmount = COALESCE(?, TotalSaleAmount) "
                                 + "WHERE SaleID = ?";

        String updateProductQuantityQuery = "UPDATE tblProducts SET " //make statement to change product quantity with placeholders
                                            + "ProductQuantity = ProductQuantity - ? "
                                            + "WHERE ProductID = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); //connect to database using predefined fields
             PreparedStatement updateSaleStmt = conn.prepareStatement(updateSaleQuery); //prevent SQL injection
             PreparedStatement updateProductStmt = conn.prepareStatement(updateProductQuantityQuery)) { //prevent SQL injection

            updateSaleStmt.setObject(1, productId);
            updateSaleStmt.setObject(2, quantitySold);
            updateSaleStmt.setString(3, saleDate);
            updateSaleStmt.setBigDecimal(4, totalSaleAmount);
            updateSaleStmt.setInt(5, saleId);
            //set placeholder values to form data
            int updatedSaleRows = updateSaleStmt.executeUpdate();
            //execute update statement
            if (updatedSaleRows > 0) {
                updateProductStmt.setInt(1, quantitySold);
                updateProductStmt.setInt(2, productId);

                int updatedProductRows = updateProductStmt.executeUpdate();

                if (updatedProductRows > 0) {
                    JOptionPane.showMessageDialog(this, "Sale and product quantity updated successfully!"); //success message if rows were updated
                } else {
                    JOptionPane.showMessageDialog(this, "Sale updated but product quantity not updated."); //message for updated sale but no quantity change
                }
            } else {
                JOptionPane.showMessageDialog(this, "No changes were made or sale not found."); //message for if there was no change
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error updating sale: " + ex.getMessage()); //display error message
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtSaleDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaleDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaleDateActionPerformed

    private void txtSaleAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaleAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaleAmountActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnFindItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindItemActionPerformed
        //this method selects a record from the database using the input ID
        int saleId = Integer.parseInt(txtIDInput.getText()); //convert IDInput into an integer
        String query = "SELECT * FROM tblSales WHERE SaleID = ?"; //select all information from sales with placeholder ID
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); //connect to database
             PreparedStatement pstmt = conn.prepareStatement(query)) { //prevent SQL injection

            pstmt.setInt(1, saleId); //set placeholder to IDInput
            try (ResultSet rs = pstmt.executeQuery()) { //executes SELECT query and stores in resultset
                if (rs.next()) { //check if query returned something and either updates or sends "not found" message
                    txtProductID.setText(String.valueOf(rs.getInt("ProductID")));
                    txtQuantity.setText(String.valueOf(rs.getInt("QuantitySold")));
                    txtSaleDate.setText(rs.getDate("SaleDate").toString());
                    txtSaleAmount.setText(rs.getBigDecimal("TotalSaleAmount").toPlainString());
                    //populate fields with data
                } else {
                    JOptionPane.showMessageDialog(this, "Sale not found!"); //not found message
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error during search: " + ex.getMessage()); //display error message
        }
    }//GEN-LAST:event_btnFindItemActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //this method deletes the selected record from the database
        
        int saleId = Integer.parseInt(txtIDInput.getText()); //convert IDInput into an integer

        String queryDeleteSale = "DELETE FROM tblSales WHERE SaleID = ?"; //SQL statement to delete record with placeholder ID
        String queryUpdateProduct = "UPDATE tblProducts SET ProductQuantity = ProductQuantity + (SELECT QuantitySold FROM tblSales WHERE SaleID = ?) WHERE ProductID = (SELECT ProductID FROM tblSales WHERE SaleID = ?)"; //SQL statement to re-add product quantity used in sale

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS); //make connection to database
             PreparedStatement pstmtDeleteSale = conn.prepareStatement(queryDeleteSale); //prevent SQL injection
             PreparedStatement pstmtUpdateProduct = conn.prepareStatement(queryUpdateProduct)) { //prevent SQL injection

            pstmtDeleteSale.setInt(1, saleId); //set placeholder to IDInput
            int deletedRows = pstmtDeleteSale.executeUpdate();

            if (deletedRows > 0) { //if a row has been deleted, update product to reflect new quantity
                pstmtUpdateProduct.setInt(1, saleId);
                pstmtUpdateProduct.setInt(2, saleId);
                pstmtUpdateProduct.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sale deleted and product quantity updated successfully!"); //successful sale deletion and product quantity change message
            } else {
                JOptionPane.showMessageDialog(this, "Sale not found or could not be deleted."); //no sale found message
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error during deletion: " + ex.getMessage()); //deletion failure message
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(IngredientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngredientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngredientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngredientUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngredientUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFindItem;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JLabel lblSelectedID;
    private javax.swing.JLabel lblUpdateDate;
    private javax.swing.JLabel lblUpdateProductID;
    private javax.swing.JLabel lblUpdateQuantity;
    private javax.swing.JLabel lblUpdateSale;
    private javax.swing.JLabel lblUpdateSaleAmount;
    private javax.swing.JTextField txtIDInput;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSaleAmount;
    private javax.swing.JTextField txtSaleDate;
    // End of variables declaration//GEN-END:variables
}
