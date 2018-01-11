package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstWindow {

    public static void main(String[] args) {

        try {
            // Set cross-platform Java L&F (also called "Metal")
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch (UnsupportedLookAndFeelException e) {
            // handle exception
        }
        catch (ClassNotFoundException e) {
            // handle exception
        }
        catch (InstantiationException e) {
            // handle exception
        }
        catch (IllegalAccessException e) {
            // handle exception
        }



        JFrame myFrame = new JFrame("My Frame");
        myFrame.setSize(800,600);
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        LayoutManager myLayoutManager = new FlowLayout();
        myFrame.setLayout(myLayoutManager);

        JPanel firstNamePanel = new JPanel();
        JLabel myLabel = new JLabel("First Name");
        firstNamePanel.add(myLabel);
        JTextField firstNameField = new JTextField(25);
        firstNamePanel.add(firstNameField);
        myFrame.add(firstNamePanel);

        JPanel lastNamePanel = new JPanel();
        JLabel lastNameLabel = new JLabel("Last Name");
        lastNamePanel.add(lastNameLabel);
        JTextField lastNameField = new JTextField(25);
        lastNamePanel.add(lastNameField);
        myFrame.add(lastNamePanel);

        JButton myButton = new JButton("Login");
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String res = firstNameField.getText();
                JOptionPane.showMessageDialog(null, "Got:" + res + " " + lastNameField.getText());
            }
        });

        JPanel myBtnPanel = new JPanel();
        myBtnPanel.add(myButton);
        myFrame.add(myBtnPanel);


        myFrame.setVisible(true);
    }
}
