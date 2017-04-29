package jdktest;


/**
 * Created by hannahzhang on 15/4/25.
 */
public class IntegerCache {
    public static void main(String[] args){
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
    }
}
