package prob171;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public int titleToNumber(String s) {
        int result = 0;

        int len = s.length()-1;
        while(len >= 0){
            result +=  (s.charAt(len) - 'A' + 1) * Math.pow(26,s.length() - len -1);
            len--;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(new Solution().titleToNumber("A"));
        System.out.println(new Solution().titleToNumber("Z"));
        System.out.println(new Solution().titleToNumber("AB"));
    }
}
