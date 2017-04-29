package jdktest;

/**
 * Created by hannahzhang on 15/4/25.
 */
public class SortTest {
    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 53, 4, 6, 34, 5, 74, 56, 7, 8};
        sort(a, 0, a.length - 1, true);
    }

    private static void sort(int[] a, int left, int right, boolean leftmost) {
//        for (int i = left, j = i; i < right; j = ++i) {
//            int ai = a[i + 1];
//            while (ai < a[j]) {
//                a[j + 1] = a[j];
//                if (j-- == left) {
//                    break;
//                }
//            }
//            a[j + 1] = ai;
//        }
         /*
                 * Skip the longest ascending sequence.
                 */
        do {
            if (left >= right) {
                return;
            }
        } while (a[++left] >= a[left - 1]);

                /*
                 * Every element from adjoining part plays the role
                 * of sentinel, therefore this allows us to avoid the
                 * left range check on each iteration. Moreover, we use
                 * the more optimized algorithm, so called pair insertion
                 * sort, which is faster (in the context of Quicksort)
                 * than traditional implementation of insertion sort.
                 */
        for (int k = left; ++left <= right; k = ++left) {
            int a1 = a[k], a2 = a[left];

            if (a1 < a2) {
                a2 = a1;
                a1 = a[left];
            }
            while (a1 < a[--k]) {
                a[k + 2] = a[k];
                System.out.println(a);
            }
            a[++k + 1] = a1;
            System.out.println(a);

            while (a2 < a[--k]) {
                a[k + 1] = a[k];
                System.out.println(a);
            }
            a[k + 1] = a2;
            System.out.println(a);
        }
        int last = a[right];
        System.out.println(a);

        while (last < a[--right]) {
            a[right + 1] = a[right];
            System.out.println(a);
        }
        a[right + 1] = last;
        System.out.println(a);
    }

    public static void test(){
    }


}
