package coding_test._07Section;

import java.util.Scanner;

public class _11_DFS {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    // 위의 재귀를 실행하고 돌아오면 다시 아래로 가서 실행하기 떄문에 앞에 1해주었던 것을 0으로 다시 만들어준다.
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        _11_DFS T = new _11_DFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
