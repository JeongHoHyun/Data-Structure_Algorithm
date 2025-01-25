package coding_test._08Section;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Island{
    int x, y;

    public Island(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class _13_BFS_Island {
    static int answer = 0, n;
    static int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
    static int[] dy = {1, -1, 0, -1, 1, 0, -1, 1};
    Queue<Island> queue = new LinkedList<>();

    public void BFS(int x, int y, int[][] board) {
        queue.offer(new Island(x, y));
        while (!queue.isEmpty()) {
            Island pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Island(nx, ny));
                }
            }
        }
    }
    public void solution(int[][] board){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0;
                    BFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) {
        _13_BFS_Island T = new _13_BFS_Island();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        T.solution(arr);
        System.out.println(answer);
    }
}
