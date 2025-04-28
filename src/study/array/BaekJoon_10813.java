package study.array;

import java.util.Scanner;

public class BaekJoon_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int z = 0; z < M; z++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }
        for (int i : basket) {
            System.out.print(i + " ");
        }
    }
}
