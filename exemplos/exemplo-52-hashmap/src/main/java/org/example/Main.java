package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static int[] twoSum(int[] numArr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numArr.length; i++) {
            int complement = target - numArr[i];

            if (numMap.containsKey(complement)) return new int[]{numMap.get(complement), i};

            numMap.put(numArr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 11};
        int target = 10;

        int[] result = twoSum(arr, target);

        System.out.println(Arrays.toString(result));
    }
}