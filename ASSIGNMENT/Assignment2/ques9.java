//Q9.Consider a sorted array and a number X find K closest numbers using two pointers.

import java.util.*;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input sorted array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target number X
        int x = sc.nextInt();

        // Input number of closest elements K
        int k = sc.nextInt();

        // Two-pointer approach
        int left = 0;
        int right = n - 1;

        while (right - left >= k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("K closest elements to " + x + ":");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}