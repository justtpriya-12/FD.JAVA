package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;

        int rev = 0;
        while(n > 0){
            int r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        if(rev == original){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
    
}
