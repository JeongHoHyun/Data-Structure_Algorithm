package coding_test._02array;

import java.util.Scanner;

class Main11{
    public int solution(int n, int[][] iArr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            int cnt = 0;
            for (int j = 1; j <= n; j++){
                for (int k = 1; k <= 5; k++){
                    // i != j 를 넣어도 되지만, 어차피 모든 값에 동일하게 +1되는 것이기 때문에 딱히 결과에 영향을 주진 않는다.
                    if (iArr[i][k] == iArr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}

public class Array_11 {
    public static void main(String[] args) {
        Main11 T = new Main11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1번부터 사용할 것 이기 때문에 n+1 을 해주었다. 또 1~5학년까지 넣어야 하기 때문에 6을 넣어주었다.
        int[][] iArr = new int[n+1][6];
        for (int i = 1; i < n; i++){
            for (int j = 1; j <= 5; j++){
                iArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, iArr));
    }



}
