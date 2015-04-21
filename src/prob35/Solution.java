package prob35;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public int searchInsert(int[] A, int target) {
        if(target < A[0])
            return 0;
        if(target > A[A.length -1])
            return A.length;
        int min = 0;
        int max = A.length -1;
        int mid = 0 ;

        while(min<=max){
            mid = (min + max)/2;
            int midVal = A[mid] ;
            //System.out.println(String.format("%d,%d,%d",min,mid,max));
            if(target == midVal) return mid;
            else if(target < midVal) max = mid -1 ;
            else min = mid + 1;
        }

        return min;
    }

    public static void main(String[] args){
        int[]A = new int[]{1,3,5,6};
        System.out.println(new Solution().searchInsert(A,5));
        System.out.println(new Solution().searchInsert(A,2));
        System.out.println(new Solution().searchInsert(A,7));
        System.out.println(new Solution().searchInsert(A,0));



    }


}
