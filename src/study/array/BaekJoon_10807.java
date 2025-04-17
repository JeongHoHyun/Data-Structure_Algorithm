package study.array;

import java.util.Scanner;

public class BaekJoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int V = sc.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i == V) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
