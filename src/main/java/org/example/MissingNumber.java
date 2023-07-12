package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5 };

        System.out.println(missingNumber(arr, 5));
    }

    public static int missingNumber(int[] nums, int maxNum) {
        int sumOfMaxNum = 0;
        int sumOfNums = 0;
        for(int i=1; i<=maxNum; i++ ){
            sumOfMaxNum += i;
        }
        for(int i=0; i<nums.length; i++){
            sumOfNums += nums[i];
        }
        return sumOfMaxNum - sumOfNums;
    }

    public static int missingNumberSort(int[] nums, int maxNum) {
        int expectedSum = 0;
        for (int i = 1; i <= maxNum; i += 1) {
            expectedSum += i;
        }

        int actualSum = Arrays.stream(nums).sum();

        return expectedSum - actualSum;
    }
}