package coding_test._08Section;

import java.util.Scanner;

public class _08_Sequence {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) {
            return dy[n][r];
        }
        if (n == r || r == 0){
            return 1;
        } else {
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r);
        }
    }

    public void DFS(int L, int sum){
        if (flag) {
            return;
        }
        if (L == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }

    }
    public static void main(String[] args) {
        _08_Sequence T = new _08_Sequence();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        // 콤비네이션 결과 값을 담는 배열
        b = new int[n];
        // 수열을 담는 배열
        p = new int[n];
        // 해당 숫자가 쓰였는지에 대한 배열
        // 인덱스 번호가 아닌 숫자 1부터 써야하기 때문에  n+1 로 선언
        ch = new int[n + 1];
        for (int i = 0; i < n; i++) {
            // b 배열에 콤비네이션 결과 값을 넣는다.
            b[i] = T.combi(n - 1, i);
        }
        T.DFS(0, 0);
    }
}
