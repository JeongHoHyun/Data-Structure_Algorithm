package coding_test._08Section;

import java.util.Scanner;

public class _02_DFS_baduk {
    static int c, n, answer = Integer.MIN_VALUE;
    public void DFS(int L, int sum, int[] arr) {
        if (sum > c){
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }
    public static void main(String[] args) {
        _02_DFS_baduk T = new _02_DFS_baduk();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
