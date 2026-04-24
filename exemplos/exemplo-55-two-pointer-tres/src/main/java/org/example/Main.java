package org.example;

public class Main {
    // Remoção de duplicatas de um vetor
    public static void removeDuplicates(int[] nums) {
        if (nums.length == 0) return;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] grupoA = new int[]{1, 2, 2, 3, 4, 5};

        removeDuplicates(grupoA);

        for (int i = 0; i < grupoA.length -1; i++){
            System.out.print(grupoA[i] + " ");
        }
    }
}