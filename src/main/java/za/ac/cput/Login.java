/**
 * User registration swing application
 * @author Martinez safari 219325332
 */
package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Login extends JFrame {
    
public static void main(String[] args) {
    
    Login frameTabel = new Login();
}

JButton blogin = new JButton("Login");
JButton bclear = new JButton("Clear");
JPanel panel = new JPanel();
JTextField userText = new JTextField("");
JPasswordField Password = new JPasswordField("");

Login(){ 
    super("Login");
    setSize(460,300);
    setLocation(500,280);
    panel.setLayout (null);
    panel.setBackground(Color.LIGHT_GRAY);
    
    panel.setBorder(BorderFactory.createTitledBorder(
    BorderFactory.createEtchedBorder(), "Login here", TitledBorder.CENTER,
    TitledBorder.TOP)); 
    
    JLabel user= new JLabel("Email:");
    user.setBounds(15, 50, 90, 25);
    panel.add(user);
    
    userText= new JTextField();
    userText.setBounds(100, 50, 170, 25);   
    panel.add(userText);
    
    JLabel example= new JLabel("Example@gmail.com");
    example.setBounds(275, 50, 170, 25);
    example.setForeground(Color.gray);
    panel.add(example);
    
    JLabel pass= new JLabel("Password:");
    pass.setBounds(15, 95, 90, 25); 
    panel.add(pass);
    
    Password= new JPasswordField(10);
    Password.setBounds(100, 95, 170, 25);
    panel.add(Password);
         
    blogin.setBounds(40,185,90,20);
    bclear.setBounds(210,185,90,20);

    panel.add(blogin);
    panel.add(bclear);
    panel.add(userText);
    panel.add(pass);

    getContentPane().add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    setVisible(true);
    actionlogin();
}
public void actionlogin(){
    
    blogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String user= userText.getText();
            String pass= Password.getText();
            
            if(user.equals("") && pass.equals("")){
               blogin.setEnabled(false);   
            }
            else{
                blogin.setEnabled(true);
                dispose();
                new Register().setVisible(true);
            }  
        }
      });
    bclear.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        userText.setText("");
        Password.setText("");
        
    }
         });
 }
}

