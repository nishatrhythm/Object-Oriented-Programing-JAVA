package summationusingjoptionpane;

import javax.swing.*;

public class SummationUsingJOptionpane {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 300);
        JOptionPane.showMessageDialog(frame, "Hello there!");
        JOptionPane.showMessageDialog(frame, "You are going to bad!", "alart", JOptionPane.WARNING_MESSAGE);
        int result = JOptionPane.showConfirmDialog(frame, "Want to delete this item?");
        switch (result) {
            case JOptionPane.YES_OPTION:
                System.out.println("Yes");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("No");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Cancel");
                break;
            default:
                break;
        }
        try {
            String s1 = JOptionPane.showInputDialog(frame, "Enter the First number");
            //int x = Integer.parseInt(s1);
            double x = Double.parseDouble(s1);
            String s2 = JOptionPane.showInputDialog(frame, "Enter the Second number");
            double y = Double.parseDouble(s2);
            double sum = x + y;
            String s = Double.toString(sum);
            JOptionPane.showMessageDialog(frame, "Sum = " + s, "Answer", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Invalid number!", "alart", JOptionPane.WARNING_MESSAGE);
        }
    }
}
