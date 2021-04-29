/**
 * User login swing application
 * @author Martinez safari 219325332
 */
package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Register extends JFrame { 

    public static void main(String[] args) {
    Register frameTabel = new Register();
    }

    JLabel welcome = new JLabel("Welcome to a New Frame");
    JPanel panel = new JPanel();

    Register(){
        
        super("Register");
        setSize(400,300);
        setLocation(500,280);
        panel.setLayout (null);
        
        JLabel name= new JLabel("Name");
        name.setBounds(15, 30, 85, 20);
        panel.add(name);
        
        JTextField nameTxt= new JTextField();
        nameTxt.setBounds(100, 30, 165, 20);
        panel.add(nameTxt);
        
        JLabel surname= new JLabel("Surname");
        surname.setBounds(15, 55, 85, 20);
        panel.add(surname);
        
        JTextField surnameTxt= new JPasswordField();
        surnameTxt.setBounds(100, 55, 165, 20);
        panel.add(surnameTxt);
        
        JRadioButton male=new JRadioButton("");
        panel.add(male);
        male.setBounds(150,152,25,25);
        
        JRadioButton female=new JRadioButton("");
        panel.add(female);
        female.setBounds(260,152,25,25);
        
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}