package src.Part_1;

import java.util.Scanner;

public class Statements {
    public static void main (String [] args) {
      Scanner input = new Scanner(System.in);
      int age;
      System.out.println("Please enter your age");
      age = input.nextInt();
      System.out.println("\n");

      if (age > 13){
        System.out.println("You are elegible to register to the website");
        System.out.println("You are elegible to register to the website\n");
      }
      else
        System.out.println("You are too young to register to our website\n");

    }
}
