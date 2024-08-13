package Leetcode.H_index;

import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        printArray(citations);
//        int hIndexValue = hIndex(citations);
//        System.out.println("h-index: " + hIndexValue);
    }

    public static void printArray(int[] arr) {
        System.out.print("Array:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations); // Sort in descending order
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            if (citations[i] <= n - i) {
                return n - i;
            }
        }
        return n;
    }

}
