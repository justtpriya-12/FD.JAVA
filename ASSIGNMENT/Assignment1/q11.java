package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int a = 1; a < n; a++){
            for(int b = a; b < n;b++){
                int cSquared = a*a + b*b;
                int c = (int) Math.sqrt(cSquared);
                
                if(c*c == cSquared && c < n){
                    System.out.println(a+", "+b+", "+c+" are pythagoras triplet");
                } 
            }
        }
        
    }
    
}
