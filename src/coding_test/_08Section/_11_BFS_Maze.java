package coding_test._08Section;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class point1{
    public int x, y;

    point1(int x, int y) {
       this.x = x;
        this.y = y;
    }
}

public class _11_BFS_Maze {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] maze, dis;
    static void BFS(int x, int y) {
        Queue<point1> Q = new LinkedList<>();
        Q.offer(new point1(x, y));
        maze[x][y] = 1;
        while (!Q.isEmpty()) {
            point1 tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    Q.offer(new point1(nx, ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        _11_BFS_Maze T = new _11_BFS_Maze();
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        T.BFS(1, 1);
        if (dis[7][7] == 0){
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }
}
