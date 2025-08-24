package Question;

import java.util.Scanner;

public class printPatternIfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 != 0){
            for(int i = 1; i <= (num-1)/2; i++){
                for(int j = 1; j < 2; j++){
                    System.out.print("*");
                }
                for(int j = 1; j <= num+2; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 1; i <= (3*num+7)/2; i++){
                System.out.print("*");
            }
            System.out.println();

            for(int i = 1; i <= (num-1)/2; i++){
                for(int j = 1; j < 2; j++){
                    System.out.print("*");
                }
                for(int j = 1; j <= num+2; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= (num+1)/2-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        } else{
            System.out.println("Even Number");
        }
    }
}
