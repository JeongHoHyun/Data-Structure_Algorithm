package coding_test._02array;

import java.util.Scanner;

class Main10{
    public int solution(int n, int[][] iArr){
        int answer = 0;
        for (int i = 1; i < n+1; i++){
            for (int j = 1 ;j <n+1; j++){
                if (iArr[i][j] > iArr[i-1][j] && iArr[i][j] > iArr[i+1][j] && iArr[i][j] > iArr[i][j-1] && iArr[i][j] > iArr[i][j+1]){
                    answer++;
                }
            }
        }
        return answer;
    }
    public int Tsolution(int n, int[][] iArr){
        int dx[] = {-1, 0, 1, 0};
        int dy[] = {0, -1, 0, 1};
        int answer = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                boolean flag = true;
                for (int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && iArr[nx][ny] >= iArr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Array_10 {
    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] iArr = new int[n+2][n+2];
        for (int i = 1; i < n+1; i++){
            for (int j = 1; j < n+1; j++){
                iArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, iArr));
    }
}
class Array_10T{
    public static void main(String[] args) {
        Main10 T = new Main10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] iArr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                iArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.Tsolution(n, iArr));
    }
}
