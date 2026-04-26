package org.example;

public class Main {
    // Remoção de duplicatas de um vetor
    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;

        for (int currentElement : nums) {
            if (uniqueIndex == 0 || currentElement != nums[uniqueIndex - 1]) {
                nums[uniqueIndex] = currentElement;
                uniqueIndex++;
            }
        }
        return uniqueIndex;
    }

    public static void main(String[] args) {
        int[] grupoA = {1, 2, 2, 3, 4, 5};

        int uniqueCount = removeDuplicates(grupoA);

        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(grupoA[i] + " ");
        }
    }
}