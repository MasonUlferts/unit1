package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
 
        Scanner input = new Scanner(System.in);
       
        System.out.println("please enter your first name.");
        String name = input.nextLine();

        System.out.println("hello, " + name);
      
    }
 }