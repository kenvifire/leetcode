package prob136;


import sun.jvm.hotspot.utilities.BitMap;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int a0 = 0;
        int n = A.length;
        while(n --> 0){
            a0 ^= A[n];
        }
        return a0;

    }

    public static void main(String[] args){
        int[] A = new int[]{1,2,3,3,2,5,5};
        System.out.println(new Solution().singleNumber(A));
    }
}
