package coding_test._08Section;

import java.util.*;

class Tomato{
    public int x, y;

    public Tomato(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class _12_BFS_Tomato {
    static int n, m;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static Queue<Tomato> Q = new LinkedList<>();

    public void BFS() {
        while (!Q.isEmpty()) {
            Tomato tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer(new Tomato(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        _12_BFS_Tomato T = new _12_BFS_Tomato();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    Q.offer(new Tomato(i, j));
                }
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Integer.max(answer, dis[i][j]);
                }
            }
        } else {
            answer = -1;
        }
        System.out.println(answer);
    }
}
