package study.array2;

import java.util.Scanner;

public class BaekJoon_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];


        int x = 0, y = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int tmp = sc.nextInt();
                arr[i][j] = tmp;
                if (max < tmp) {
                    max = tmp;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
