
package za.ac.cput;

import java.util.Scanner;

/**
 * Login and registration class
 * @author Martinez safari 219325332
 */
public class LoginSystem {
    private String user_email;
    private String password;
    private String name;
    private String surname;
    private String idNumber;
    private String address;
    private long contactNumber;
    
    public void user(){
        Scanner input= new Scanner(System.in);

        System.out.print("Email: ");
        user_email= input.nextLine();
        
        System.out.print("Password: ");
        password= input.nextLine();
        
        int option;
          System.out.println("1: to login");
          System.out.println("2: to register");
          System.out.println("3: to exit");
          option = input.nextInt();
          
        switch(option){
            case 1:
                System.out.println("welcome");
                
                break;
            case 2:
                login();
                break;
            case 3: 
                System.out.println("Thank you");
                System.exit(0);
        }
    }
    public void login(){
        Scanner input= new Scanner(System.in);
   
        System.out.println("Enter name: ");
        name= input.nextLine();
        
        System.out.println("Enter surname: ");
        surname= input.nextLine();
        
        System.out.println("Enter ID: ");
        idNumber= input.nextLine();
        
        System.out.println("Enter Address: ");
        address= input.nextLine();
        
        System.out.println("Enter Contact: ");
        contactNumber= input.nextLong();
        
        System.out.println("Success");
        System.exit(0);
        
    }              
    
}
