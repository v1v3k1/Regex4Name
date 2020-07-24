/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex4name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vivek and ayush
 */
public class Regex4Name {

   
       // Function to validate the username 
    public static boolean isValidUsername(String name) 
    { 
  
        // Regex to check valid username. 
        String regex = "^\\p{L}+[\\p{L}\\p{Z}\\p{P}]{0,}"; 
       
  
        // Compile the ReGex 
        Pattern p = Pattern.compile(regex); 
  
        // If the username is empty 
        // return false 
        if (name == null) { 
            return false; 
        } 
  
        // Pattern class contains matcher() method 
        // to find matching between given username 
        // and regular expression. 
        Matcher m = p.matcher(name); 
  
        // Return if the username 
        // matched the ReGex 
        return m.matches(); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  Scanner scn = new Scanner(System.in);
        // Test Case: 1 
        System.out.println("Please Enter your name = ");
        String str1 = scn.nextLine(); 
        System.out.println(isValidUsername(str1)); 
  
        
    } 
} 

