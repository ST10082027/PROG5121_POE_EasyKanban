/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_tasklogger;

import java.util.Scanner;

/**
 *
 * @author johnhoffmanprinsloo
 */
public class RunApplication {

    /*|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    Method
    Prompts the user to enter a username, password, first name and lastname. The method then checks if the input meets
    pre-specified requirements. The app then prompts the user to login.
     */
    public void RegisterAndLogin() {
        //Scanner captures user input
        Scanner userInput = new Scanner(System.in);
        
        //Prompts and capturing of user details
        System.out.println("Enter a username:");
        String username = userInput.nextLine();
        System.out.println("Enter a password:");
        String password = userInput.nextLine();
        System.out.println("Enter your first name:");
        String firstName = userInput.nextLine();
        System.out.println("Enter your last name:");
        String lastName = userInput.nextLine();
        
        //Initializng constructor to access methods of the Login class
        Login user = new Login(username, password, firstName, lastName);
        
        //Message displayed after successful or unsuccessful registration
        String registrationMessage = user.registerUser();
        System.out.println(registrationMessage);
        
        //Prompts to login
        System.out.println("Enter your username:");
        String inputUsername = userInput.nextLine();
        System.out.println("Enter your password:");
        String inputPassword = userInput.nextLine();
        
        //Checks if the users username and password are stored.
        boolean isLoggedIn = user.loginUser(inputUsername, inputPassword);
        
        //Message displayed after successful login. 
        String loginStatusMessage = user.returnLoginStatus(isLoggedIn);
        System.out.println(loginStatusMessage);
    }
    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
}
