package study.array;

import java.util.Scanner;

public class BaekJoon_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int []arr = new int[N];
        for(int i = 0; i < N; i ++) {
            arr[i] = i+1;
        }

        for (int x = 0; x < M; x++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            while (i <= j) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                j--;
                i++;
            }
        }
        sc.close();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
