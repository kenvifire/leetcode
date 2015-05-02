package prob70;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public int climbStairs(int n) {
        if(n <= 1)
            return 1;

        int [] steps = new int[n+1];

        //init
        steps[0] = 1;
        steps[1] = 1;

        for(int i= 2;i <=n;i++){
            steps[i] = steps[i-1] + steps[i-2];
        }

        return steps[n];
    }

    public static void main(String[] args){
        //System.out.println(new Solution().climbStairs(1));
        //System.out.println(new Solution().climbStairs(2));
        //System.out.println(new Solution().climbStairs(3));
        System.out.println(new Solution().climbStairs(44));



    }


}
