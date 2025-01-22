package coding_test._08Section;

import java.util.Scanner;

public class _10_DFS_Maze {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] maze;
    static int answer = 0;
    public void DFS(int x, int y){
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    // 방문한 곳을 1로 표시
                    maze[nx][ny] = 1;
                    DFS(nx, ny);
                    // 백트래 : 이전상태로 돌아감
                    maze[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        _10_DFS_Maze T = new _10_DFS_Maze();
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        // 출발지점을 1로 체크하고 시작
        maze[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }
}
