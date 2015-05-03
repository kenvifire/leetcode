package prob75;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public void sortColors(int[] A) {
        int r = 0, w = 0, b = 0;

        for(int c : A){
            if( c == 0)
                r++;
            else if( c== 1)
                w++;
            else if(c == 2)
                b++;
        }
        int i=0;
        while(r --> 0){
           A[i++] = 0;
        }
        while (w --> 0){
            A[i++] = 1;
        }

        while (b --> 0){
            A[i++] = 2;
        }

    }



    public static void main(String[] args){
        int[] colors = new int[]{
                1,2,0,2,2,1
        };

        new Solution().sortColors(colors);
        System.out.println(colors);

    }


}
