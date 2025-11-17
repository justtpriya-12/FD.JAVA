//Q2.	Sliding window - Maximum Sum Subarray of size k. Also solve for dynamic window size 

import java.util.Scanner;

public class ques2 {
    public static int maxSumSubarray(int[] nums, int k) {
        int maxSum = 0, windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        if (k > n) {
            System.out.println("Window size cannot be greater than array size.");
        } else {
            System.out.println("Max sum of subarray of size " + k + ": " + maxSumSubarray(nums, k));
        }

        sc.close();
    }
}