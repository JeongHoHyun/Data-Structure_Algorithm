package study.array;

import java.util.Scanner;

public class BaekJoon_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if (i < X) {
                System.out.print(i + " ");
            }
        }
    }
}
