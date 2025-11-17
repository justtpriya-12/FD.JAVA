//package ASSIGNMENT.Assignment2;

//Q1.	Set an array such that the elements with higher frequency comes first, 
//if two elements tie the sort by ascending values.

import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert array to list for sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 3: Sort using custom comparator
        list.sort((a, b) -> {
            int freqCompare = freqMap.get(b) - freqMap.get(a); // Descending frequency
            if (freqCompare == 0) {
                return a - b; // Ascending value if frequencies tie
            }
            return freqCompare;
        });

        // Step 4: Print result
        System.out.println("Sorted array by frequency:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
