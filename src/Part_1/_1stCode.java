package src.Part_1;

import java.util.Scanner;

public class _1stCode {
    public static void main (String [] args) {
      System.out.println("Hello tester");
      System.out.println("Welcome to the Java World/n");
      int assigment_total = 40;
      int exam_total = 200;
      int assigment_grade;
      int exam_grade;

      Scanner input = new Scanner(System.in);
      ///////////////////////////////////////////////////////////
      System.out.println("Please enter your assignments grade:");
      assigment_grade = input.nextInt();
      System.out.println("Please enter your final exam grade:");
      exam_grade = input.nextInt();

      int student_grade = assigment_grade + exam_grade;
      int total = assigment_total + exam_total;
      float percentage = (float) student_grade/total * 100;

      System.out.println("Your total grade is: "+ student_grade);
      System.out.println("Your percentage is: "+ percentage);

    }
}
