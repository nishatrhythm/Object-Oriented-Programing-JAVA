package Company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
          
        String item1 = JOptionPane.showInputDialog(null, "Enter Item 1 Quantity: ");
        int a = Integer.parseInt(item1);
        
        String item2 = JOptionPane.showInputDialog(null, "Enter Item 2 Quantity: ");
        int b = Integer.parseInt(item2);
        
        String item3 = JOptionPane.showInputDialog(null, "Enter Item 3 Quantity: ");
        int c = Integer.parseInt(item3);
        
        String item4 = JOptionPane.showInputDialog(null, "Enter Item 4 Quantity: ");
        int d = Integer.parseInt(item4);
        
        double grossSales = (a * 220) + (b * 120) + (c * 100) + (d * 350);
        double Earnings = 2000 + (grossSales * 0.09);
        
//      JOptionPane.showMessageDialog(null, "Total Sale: " +grossSales "\nTotal Payment: " +Earnings);
        
        JOptionPane.showMessageDialog(null, "Total Sale: " +grossSales);
        JOptionPane.showMessageDialog(null, "Total Payment: " +Earnings);
        
    }
    
}
