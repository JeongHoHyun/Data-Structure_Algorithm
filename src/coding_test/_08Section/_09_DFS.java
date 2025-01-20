package coding_test._08Section;

import java.util.Scanner;

public class _09_DFS {
    static int n, m;
    static int[] combi;

    private void DFS(int L, int s) {
        if (L == m) {
            for (int i : combi) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        _09_DFS T = new _09_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
