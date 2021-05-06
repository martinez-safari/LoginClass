/**
 * User login swing application
 * @author Martinez safari 219325332
 */
package za.ac.cput;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Register extends JFrame { 

    public static void main(String[] args) 
    {
        
        Register frameTabel = new Register();
    }
    JButton bback = new JButton("Back");
    JButton bnext = new JButton("Next");
    JButton bsubmit = new JButton("Submit");
    
    JPanel panel = new JPanel();

    Register(){

        super("Register");
        setSize(500,400);
        setLocation(300,180);
        panel.setLayout (null);
        panel.setBackground(Color.LIGHT_GRAY);

        panel.setBorder(BorderFactory.createTitledBorder(
        BorderFactory.createEtchedBorder(), "Login here", TitledBorder.CENTER,
        TitledBorder.TOP));

        JLabel name= new JLabel("Name");
        name.setBounds(15, 30, 85, 30);
        panel.add(name);

        JTextField nameTxt= new JTextField();
        nameTxt.setBounds(150, 30, 175, 30);
        panel.add(nameTxt);

        JLabel surname= new JLabel("Surname");
        surname.setBounds(15, 75, 85, 30);
        panel.add(surname);

        JTextField surnameTxt= new JTextField();
        surnameTxt.setBounds(150, 75, 175, 30);
        panel.add(surnameTxt);

        JLabel gender= new JLabel("Gender");
        gender.setBounds(15, 115, 85, 30);
        panel.add(gender);

        JRadioButton male = new JRadioButton("male", true);
        JRadioButton female = new JRadioButton("female");

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        panel.add(male);
        panel.add(female);

        male.setBounds(150, 115, 65, 30);    
        female.setBounds(260, 115, 65, 30);  

        JLabel id= new JLabel("ID Number");
        id.setBounds(15, 155, 85, 30);
        panel.add(id);

        JTextField idTxt= new JTextField();
        idTxt.setBounds(150, 155, 175, 35);
        panel.add(idTxt);

        JLabel contact= new JLabel("Phone Number");
        contact.setBounds(15, 205, 85, 30);
        panel.add(contact);

        JTextField contactTxt= new JTextField();
        contactTxt.setBounds(150, 205, 175, 30);
        panel.add(contactTxt);

        JLabel address= new JLabel("Address");
        address.setBounds(15, 255, 85, 30);
        panel.add(address);

        JTextField addressTxt= new JTextField();
        addressTxt.setBounds(150, 255, 175, 30);
        panel.add(addressTxt);
        
        bback.setBounds(15,320,100,20);
        bnext.setBounds(375,320,100,20);
        bsubmit.setBounds(200,320,100,20);

        panel.add(bback);
        panel.add(bnext);
        panel.add(bsubmit);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionRegister();
    }

    private void actionRegister() {
        bback.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
              dispose();
               new Login().setVisible(true);
        }
      });
      bnext.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
              dispose();
               //new next().setVisible(true);
        }
      });
      bsubmit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
             JOptionPane.showMessageDialog(null,"Well done",  " MsgBox",JOptionPane.PLAIN_MESSAGE);
        }
      });
    }
 }      