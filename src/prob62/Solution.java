package prob62;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    //
    public int uniquePaths(int m, int n) {

        int[][] paths = new int[m+1][n+1];

        for(int i=0;i<=m;i++)
            paths[i][1] = 1;

        for(int j=0;j<=n;j++)
            paths[1][j] = 1;

        for(int i=2;i<=m;i++)
            for (int j = 2; j<= n;j ++){
                paths[i][j] = paths[i-1][j]+ paths[i][j-1];
            }

        return paths[m][n];

//        if(m <=1  || n <= 1)
//            return 1;
//        return uniquePaths(m,n-1) + uniquePaths(m-1,n);
//
    }

    public static void main(String[] args){

        System.out.println(new Solution().uniquePaths(1,1));
        System.out.println(new Solution().uniquePaths(2,2));
        System.out.println(new Solution().uniquePaths(3,3));


    }


}
