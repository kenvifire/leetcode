package prob13;


/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public int romanToInt(String s) {
        String[] base = new String[]{"I","II","III","IV","V","VI","VII","VII","IX"};
        String ten = "X";
        String fifty = "L";
        String hundred = "C";
        String fiveHundred = "D";
        String thousand = "M";

        int result = 0;
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i) ;
            Character next = null;
            if(i < s.length()-1){
               next = s.charAt(i+1);
            }

            switch (c){
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if(next != null && next.equals('D')){
                        result += 400;
                        i++;
                    }else if(next !=null && next.equals('M')){
                        result += 900;
                        i++;
                    }else {
                        result += 100;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if(next !=null && next.equals('L')){
                        result += 40;
                        i++;
                    }else if(next != null && next.equals('C')){
                        result += 90;
                        i++;
                    }else {
                        result += 10;
                    }
                    break;
                case 'I':
                    if(next != null && next.equals('V')){
                        result += 4;
                        i++;
                    }else if(next != null && next.equals('X')){
                        result += 9;
                        i++;
                    }else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;


            }
            i++;

        }
        return result;
    }

    public static void main(String[] args){

        System.out.println(new Solution().romanToInt("I"));
        System.out.println(new Solution().romanToInt("II"));
        System.out.println(new Solution().romanToInt("III"));
        System.out.println(new Solution().romanToInt("IV"));
        System.out.println(new Solution().romanToInt("V"));
        System.out.println(new Solution().romanToInt("VI"));
        System.out.println(new Solution().romanToInt("VII"));
        System.out.println(new Solution().romanToInt("VIII"));
        System.out.println(new Solution().romanToInt("IX"));
        System.out.println(new Solution().romanToInt("X"));
        System.out.println(new Solution().romanToInt("XI"));
        System.out.println(new Solution().romanToInt("MMMCMXCIX"));


    }


}
