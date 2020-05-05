package app;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("how many inches are in a foot");
        String enteredpassword = input.nextLine();

        if (enteredpassword.equals(12)){
          
        }
        System.out.println("CORRECT");{

        }
        System.out.println("What is the capitol of Minnesota");
        Scanner capitol = new Scanner(System.in);

        String password = capitol.nextLine();

        if (password.equals("Minneapolis")){

        }
        System.out.println("Incorrect");{

        }
        System.out.println("what year is it");
        Scanner year = new Scanner(System.in);

        String newpassword = year.nextLine();

        if (newpassword.equals(2020)){

        }
        System.out.println("CORRECT");


        
      
    }
 }