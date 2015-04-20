package prob122;


import sun.jvm.hotspot.utilities.Assert;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;

        for(int i = 1; i< prices.length; i++){
            result += prices[i-1] < prices[i] ? prices[i] - prices[i-1] : 0;
        }
        return result;

//        int max = 0;
//        for(int i = 0 ; i < prices.length; i++){
//            for(int j=i+1; j < prices.length; j++){
//                max = max > (prices[j] - prices[i]) ? max : (prices[j] - prices[i]);
//            }
//        }
//
//        return max;
    }


    public static void main(String[] args){

        int[] prices = new int[] {3,2,4,5,2,1,6};
        System.out.println(new Solution().maxProfit(prices));
    }


}
