package org.example;

import java.util.Arrays;

public class Main {

    public static int[] twoSum(int[] arr, int target) {
        int[][] indexed = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            indexed[i][0] = arr[i];
            indexed[i][1] = i;
        }

        Arrays.sort(indexed, (a, b) -> a[0] - b[0]);

        int left = 0; // Ponteiro esquerdo
        int right = indexed.length - 1; // Ponteiro direito

        while (left < right) {
            int currentSum = indexed[left][0] + indexed[right][0];
            if (currentSum == target) return new int[]{indexed[left][1], indexed[right][1]};
            else if (currentSum < target) left++;
            else right--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {3, 2,4};
        int target = 6;
        int[] result = twoSum(arr, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}