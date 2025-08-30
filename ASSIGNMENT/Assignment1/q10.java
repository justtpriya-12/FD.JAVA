package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;

        int strong = 0;
        while(temp != 0){
            int r = temp%10;
            int fact = 1;
            for(int i = 1; i <= r; i++){
                fact = fact*i;
            }
            strong = strong+fact;
            temp = temp/10;
        }
        if(strong == n){
            System.out.println("Strong number");
        } else{
            System.out.println("Not a strong number");
        }
    }
    
}
