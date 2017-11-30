package pl.waw.sgh;

import javax.swing.*;

public class GuiInput {

    public static void main(String[] args) {
        int decision = JOptionPane.YES_OPTION;

        while (decision!=JOptionPane.NO_OPTION) {
            String input = JOptionPane.showInputDialog(
                    null, "Please provide your name:");
            JOptionPane.showMessageDialog(null, "Hello " + input);
            decision = JOptionPane.showConfirmDialog(null, "Do you want to continue");
//            JOptionPane.showMessageDialog(null, "Your decision is: " + decision);
        }

    }
}
