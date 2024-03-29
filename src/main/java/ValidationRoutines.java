/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import java.awt.Component;
import java.math.BigDecimal;
/**
 *
 * @author Max
 */
public class ValidationRoutines {
    
    public static boolean isValidString(String text, String fieldName, Component parent) {
        if (text == null || text.trim().isEmpty()) { //remove white space and check if null/empty
            JOptionPane.showMessageDialog(parent, "Please enter a " + fieldName + "."); //ask user to enter data into the empty field
            return false;
        }
        return true;
    }

    public static Integer parseInteger(String numberStr, String fieldName, Component parent) {
        try {
            return Integer.parseInt(numberStr); //attempts to turn string into an integer
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(parent, "Please enter a valid number for " + fieldName + "."); //tells user to actually enter a valid number
            return null;
        }
    }

    public static BigDecimal parseBigDecimal(String numberStr, String fieldName, Component parent) {
        try {
            BigDecimal number = new BigDecimal(numberStr); //attempts to turn string into BigDecimal
            if (number.compareTo(BigDecimal.ZERO) <= 0) {
                JOptionPane.showMessageDialog(parent, fieldName + " must be greater than 0."); //ensures number is greater than 0
                return null;
            }
            return number;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(parent, "Please enter a valid number for " + fieldName + "."); //tells user to actually enter a valid number
            return null;
        }
    }

    
}
