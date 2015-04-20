package prob201;



/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        //1. m == n
        if( m == n )
            return  m;
        int logM = (int)Math.floor(Math.log(m) / Math.log(2));
        int logN = (int)Math.floor(Math.log(n) / Math.log(2));

        //2.   2^(y-1) < m <=2^y,  2^(x-1) < n <= 2^x, x != y
        if(logM != logN){
            return 0;
        }
         //3. 2^(x-1) < m <=2^x,  2^(x-1) < n <= 2^x
        else {
            int diff = (int)Math.floor(Math.log(n - m) / Math.log(2)) + 1;
            m >>= diff;
            n >>= diff;
            return (m&n) << diff;

        }





    }

    public static void main(String[] args){
        System.out.println(new Solution().rangeBitwiseAnd(4,7));
    }
}
