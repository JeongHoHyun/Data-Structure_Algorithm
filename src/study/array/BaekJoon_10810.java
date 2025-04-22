package study.array;

import java.util.Scanner;

public class BaekJoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int v = 0; v < M; v++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int z = i-1; z <= j-1; z++) {
                arr[z] = k;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
