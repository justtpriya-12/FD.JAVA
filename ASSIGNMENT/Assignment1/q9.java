package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int original = n;

        int countdigit = 0;
        while(temp != 0){
            temp = temp/10;
            countdigit++;
        }

        temp = n;
        int num = 0;
        while(temp != 0){
            int r = temp%10;
            num = num + (int)Math.pow(r,countdigit);
            temp = temp/10;
        }
        if(num == original){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not Armstrong");
        }

    }
    
}
