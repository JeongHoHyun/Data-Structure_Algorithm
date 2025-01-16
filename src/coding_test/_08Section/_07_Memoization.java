package coding_test._08Section;

import java.util.Scanner;

public class _07_Memoization {
    int[][] dy = new int[35][35];
    // 콤비네이션을 DFS로 구하는 메소드
    public int DFS(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }
    public static void main(String[] args) {
        _07_Memoization T = new _07_Memoization();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
