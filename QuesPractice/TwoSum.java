package QuesPractice;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        for(int i = 0; i < n-1; i++){
            for(int j = i+1; i < n; i++){
                if(target == arr[i] + arr[j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
    
}
