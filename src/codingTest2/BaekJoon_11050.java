package codingTest2;

import java.util.Scanner;

public class BaekJoon_11050 {
    public static void main(String[] args) {
        // 조합문제
        // 이항계수 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] D = new int[N+1][N+1];
        for (int i = 0; i <= N; i++) {
            D[i][1] = i;
            D[i][0] = 1;
            D[i][i] = 1;
        }

        // 인경우는 초기화를 해놓았기 때문에 2부터 시작
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                D[i][j] = D[i - 1][j] + D[i - 1][j - 1];
            }
        }

        System.out.println(D[N][K]);
    }
}
