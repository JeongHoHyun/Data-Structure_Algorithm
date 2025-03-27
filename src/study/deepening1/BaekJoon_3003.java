package study.deepening1;

import java.util.Scanner;

public class BaekJoon_3003 {
    public static void main(String[] args) {
        int[] answer = new int[] {1, 1, 2, 2, 2, 8};
        Scanner sc = new Scanner(System.in);
        String[] A = sc.nextLine().split(" ");
        int[] result = new int[6];
        for (int i = 0; i < 6; i++) {
            result[i] = answer[i] - Integer.parseInt(A[i]);
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}