package coding_test._02array;

import java.util.Scanner;

class Main12 {
    public int solution(int n, int m, int[][] iArr){
        int answer = 0;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int cnt = 0;
                // i != j 라는 조건을 걸어도 되지만 같은 결과가 나오기 때문에 상관 없음.
                for (int k = 0; k < m; k++){
                    int pi = 0, pj =0;
                    for (int s = 0; s < n; s++) {
                        if (iArr[k][s] == i){
                            pi = s;
                        }
                        if (iArr[k][s] == j){
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        cnt++;
                    }
                }
                if (cnt == m){
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Array_12 {
    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] iArr = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                iArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, iArr));
    }
}
