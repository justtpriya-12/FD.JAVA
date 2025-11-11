//package QuesPractice;

import java.util.Scanner;

public class strRev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example input: h e l l o
        System.out.println("Enter characters separated by space:");
        String[] input = sc.nextLine().split(" ");
        
        char[] s = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            s[i] = input[i].charAt(0);
        }

        // Reverse the char array
        int start = 0, end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        // Print reversed array
        System.out.print("Reversed: ");
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
}

