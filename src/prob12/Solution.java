package prob12;


import sun.jvm.hotspot.utilities.Assert;

import javax.sound.midi.Soundbank;

/**
 * Created by hannahzhang on 15/4/20.
 */
public class Solution {

    public String intToRoman(int num) {

        StringBuilder roman = new StringBuilder();
        int thousand = num / 1000;
        int hundred = num % 1000 / 100;
        int ten = num % 100 /10;
        int one = num % 10;



        switch (thousand){
            case 1:
                roman.append("M");
                break;
            case 2:
                roman.append("MM");
                break;
            case 3:
                roman.append("MMM");
                break;
            default:
                break;
        }

        //C,D,M
        switch (hundred){
            case 1:
                roman.append("C");
                break;
            case 2:
                roman.append("CC");
                break;
            case 3:
                roman.append("CCC");
                break;
            case 4:
                roman.append("CD");
                break;
            case 5:
                roman.append("D");
                break;
            case 6:
                roman.append("DC");
                break;
            case 7:
                roman.append("DCC");
                break;
            case 8:
                roman.append("DCCC");
                break;
            case 9:
                roman.append("CM");
                break;
            default:
                break;
        }

        //X,L,C
        switch (ten){
            case 1:
                roman.append("X");
                break;
            case 2:
                roman.append("XX");
                break;
            case 3:
                roman.append("XXX");
                break;
            case 4:
                roman.append("XL");
                break;
            case 5:
                roman.append("L");
                break;
            case 6:
                roman.append("LX");
                break;
            case 7:
                roman.append("LXX");
                break;
            case 8:
                roman.append("LXXX");
                break;
            case 9:
                roman.append("XC");
                break;
            default:
                break;
        }

        //I,V,X
        switch (one){
            case 1:
                roman.append("I");
                break;
            case 2:
                roman.append("II");
                break;
            case 3:
                roman.append("III");
                break;
            case 4:
                roman.append("IV");
                break;
            case 5:
                roman.append("V");
                break;
            case 6:
                roman.append("VI");
                break;
            case 7:
                roman.append("VII");
                break;
            case 8:
                roman.append("VIII");
                break;
            case 9:
                roman.append("IX");
                break;
            default:
                break;
        }


        return roman.toString();
    }

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
        Solution s = new Solution();

        for(int i=1;i<=3999;i++){
            Assert.that(s.romanToInt(s.intToRoman(i)) == i,i + " not right");
        }
        System.out.println(new Solution().intToRoman(3299));

        System.out.println(new Solution().romanToInt(new Solution().intToRoman(3299)));


    }


}
