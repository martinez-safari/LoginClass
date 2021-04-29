/**
 * User registration swing application
 * @author Martinez safari 219325332
 */
package za.ac.cput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

public static void main(String[] args) {
    
    Login frameTabel = new Login();
}

JButton blogin = new JButton("Login");
JPanel panel = new JPanel();
JTextField userText = new JTextField("");
JPasswordField Password = new JPasswordField("");

Login(){ 
    super("Login Here");
    setSize(400,300);
    setLocation(500,280);
    panel.setLayout (null);
    
    JLabel user= new JLabel("UserName");
    user.setBounds(15, 30, 85, 20);
    panel.add(user);
    
    userText= new JTextField(20);
    userText.setBounds(100, 30, 165, 20);
    panel.add(userText);
    
    JLabel pass= new JLabel("Password");
    pass.setBounds(15, 55, 85, 20);
    panel.add(pass);
    
    Password= new JPasswordField();
    Password.setBounds(100, 55, 165, 20);
    panel.add(Password);
         
    blogin.setBounds(110,110,80,20);

    panel.add(blogin);
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
            
            String userName = userText.getText();
            String password = Password.getText();
    
            if(userName.equals("test") && password.equals("12345")) 
            {      
                Register newf =new Register();
                newf.setVisible(true);
                dispose();
            } 
            else 
            {
                JOptionPane.showMessageDialog(null,"Wrong Password / Username");
                userText.setText("");
                Password.setText("");
                userText.requestFocus();
            }

        }
    });
}
}