package JAVA;

import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input a number and print.
        System.out.print("Enter the number :");
        int marks = sc.nextInt();
        System.out.println(marks);

        // Take input 2 int number and print the sum of these number.
        System.out.print("Enter the first number :");
        int a = sc.nextInt();
        System.out.print("Enter the second number :");
        int b = sc.nextInt();
        System.out.println("The sum of number is :"+(a+b));

        
    }
}
