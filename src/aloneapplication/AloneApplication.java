/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aloneapplication;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author sipl
 */
public class AloneApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter the no. of test cases");
        int testcaseno = sc.nextInt();
        if(testcaseno >= 1 || testcaseno <= 10 )
        {
            System.out.println("Enter the no. of employees in the test case ");
            int employeeno = sc.nextInt();
            if(employeeno >= 3 || employeeno <= 1001 )
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the " + employeeno +" employee names separated by space in between them");
                String employeeNameStr = "";
                employeeNameStr +=scan.nextLine();
                String[] employeeNames = employeeNameStr.split(" ");
                char [] employeeInitials = new char[employeeno];
                StringBuilder sb1 = new StringBuilder("");
                for(int i=0 ; i < employeeNames.length ;i++){
                    sb1.append(employeeNames[i].charAt(0));
                    employeeInitials[i] = employeeNames[i].charAt(0);
                }
                System.out.println(sb1);
//                for(int i=0;i<employeeInitials.length;i++){
//                    for(int k= i+1 ; k < employeeInitials.length ; k++){
//                        if(employeeInitials[i] != employeeInitials[k])
//                        {
//                            System.out.println("I am Alone "+employeeInitials[i]);
//                        }
//                    }
//                }
                char initial = employeeInitials[0];
                for(char i : employeeInitials){
                    if(i != initial){
                        System.out.println("You are Alone "+i);
                    }
                }


            }
            else
            {
                System.out.println("No. of employees in the testcase cannot be more than 1001 or less than 3");
            }
            
        }
        else
        {
            System.out.println("invalid input for no. of test case");                 
        }
        }
    } 
}

        
        
        
        
        
        
        
        
        
    
    

