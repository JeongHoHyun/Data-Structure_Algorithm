package study.array;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int A = sc.nextInt();
            arr[i] = A % 42;
        }
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
