package prob191;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
           if((n & 0x0001) == 1) {
               count ++;
           }
           n >>= 1;
        }
        return count;

    }

    public static void main(String[] args){

        System.out.println(new Solution().hammingWeight(11));
        System.out.println(new Solution().hammingWeight(1));
        System.out.println(new Solution().hammingWeight(3));
        System.out.println(new Solution().hammingWeight(4));
        //System.out.println(new Solution().hammingWeight(2147483648));
    }
}
