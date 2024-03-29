/*

💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

**Example 1:**
Input: nums = [1,2,3,1]

Output: true


 */
import java.util.HashSet;
import java.util.Set;

public class Question6 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            
            set.add(num);
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] nums = { 2,5,3,6,8,4,3};
        
        boolean result = containsDuplicate(nums);
        
        System.out.println("Output: " + result);
       
    }
}
