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
        if (text == null || text.trim().isEmpty()) {
            JOptionPane.showMessageDialog(parent, "Please enter a " + fieldName + ".");
            return false;
        }
        return true;
    }

    public static Integer parseInteger(String numberStr, String fieldName, Component parent) {
        try {
            return Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(parent, "Please enter a valid number for " + fieldName + ".");
            return null;
        }
    }

    public static BigDecimal parseBigDecimal(String numberStr, String fieldName, Component parent) {
        try {
            BigDecimal number = new BigDecimal(numberStr);
            if (number.compareTo(BigDecimal.ZERO) <= 0) {
                JOptionPane.showMessageDialog(parent, fieldName + " must be greater than 0.");
                return null;
            }
            return number;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(parent, "Please enter a valid number for " + fieldName + ".");
            return null;
        }
    }

    
}
