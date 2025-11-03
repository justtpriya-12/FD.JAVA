//package LEETCODE;

import java.util.Scanner;

public class lt_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sub;
        int maxProfit = 0;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                sub = arr[j]  - arr[i];
                if(sub > maxProfit){
                    maxProfit = sub;
                }
            }
        }
        if(maxProfit > 0){
            System.out.println(maxProfit);
        } else {
            System.out.println("0");
        }
    }
    
}
