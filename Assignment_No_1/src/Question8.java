/*
💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

 */
import java.util.Arrays;

public class Question8 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        Arrays.sort(nums);
        
        int duplicate = -1;
        int missing = 1;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                duplicate = nums[i];
            } else if (nums[i] > nums[i - 1] + 1) {
                missing = nums[i - 1] + 1;
            }
        }
        
      
        if (nums[n - 1] != n) {
            missing = n;
        }
        
        result[0] = duplicate;
        result[1] = missing;
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        
        int[] result = findErrorNums(nums);
        
        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        
    }
}

