package coding_test._08Section;

import java.util.Scanner;

public class _06_DFS {
    static int n, m;
    static int[] arr, ch, pm;

    public void DFS(int L) {
        if (L == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        _06_DFS T = new _06_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
