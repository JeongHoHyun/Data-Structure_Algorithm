package coding_test._08Section;

import java.util.Scanner;

public class _03_DFS_MaxPoint {
    static int n, m, answer = Integer.MIN_VALUE;
    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > m) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }
    public static void main(String[] args) {
        _03_DFS_MaxPoint T = new _03_DFS_MaxPoint();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] nArr = new int[n];
        int[] mArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
            mArr[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0, nArr, mArr);
        System.out.println(answer);
    }
}
