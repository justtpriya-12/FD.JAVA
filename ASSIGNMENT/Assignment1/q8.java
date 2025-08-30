package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 1){
            System.out.println("Not a prime number");
        } else if(n == 2){
            System.out.println("Prime number");
        } else{
            int i = 2;
            while (i < n) {
                if(n%i == 0){
                    System.out.println("Not a prime number");
                    return;
                }
                i++;
            }
            System.out.println("Prime number");
        }
       
        
    }
    
}
