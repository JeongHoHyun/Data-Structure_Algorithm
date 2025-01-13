package coding_test._08Section;

import java.util.Scanner;

public class _04_DFS_Duple {
    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }

        }

    }
    public static void main(String[] args) {
        _04_DFS_Duple T = new _04_DFS_Duple();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        T.DFS(0);

    }
}
