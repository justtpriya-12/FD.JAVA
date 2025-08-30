package ASSIGNMENT.Assignment1;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ft = 0;
        int st = 1;

        System.out.print(ft+" ");
        System.out.print(st+" ");

        int i = 2;
        while(i < n){
            int tt = ft+st;
            System.out.print(tt+" ");
            ft = st;
            st = tt;
            i++;

        }
    }
    
}
