package prob169;


import java.util.Arrays;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;

        Arrays.sort(nums);
        return nums[n];
    }



    public static void main(String[] args){
        int[] nums = new int[]{1,2,2};
        System.out.println(new Solution().majorityElement(nums));
    }
}
