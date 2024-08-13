package Leetcode.MajorityElement;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        for (int x : nums){
            if(validate(nums,x)){
                return x;
            }
        }
        return -1;
    }

    boolean validate(int[] nums, int majority){
        int count = 0;
        for (int n : nums){
            if(n == majority){
                count++;
            }
        }
        return count > nums.length / 2;
    }
}
