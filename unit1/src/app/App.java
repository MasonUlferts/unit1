package app;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
       Account account1 = new Account();

       System.out.println("what is your name");
       account1.name = input.nextLine();

       System.out.println("what is your starting balence");
       account1.startingbalance = input.nextLine();

       System.out.println("What passcode do you want");
       account1.password = input.nextLine();

       System.out.println("Account created, please log in.");

       System.out.println("what is your name?");
       input.nextLine();
       String name1 = input.nextLine();
       If (name1.equals(account.name)) {
           System.out.println("enter your password");
           int password1 = input.nextLine();
       }
    }

    
 



    
 }