package study.array;

import java.util.Scanner;

public class BaekJoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = 9;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int idx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
