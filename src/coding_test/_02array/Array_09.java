package coding_test._02array;

import java.util.Scanner;

class Main9{
    public int bestSolution(int n, int[][] iArr){
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        for (int i =0; i < n; i++){
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++){
                sum1 += iArr[i][j];
                sum2 += iArr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++){
            sum1 += iArr[i][i];
            sum2 += iArr[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }
    public int solution(int n, int[][] iArr){
        int answer = 0;
        int x = 0;
        int y = 0;
        int xy = 0;
        int sum_xy = 0;
        int x_cnt = 0;
        int y_cnt = iArr.length-1;
        while (y_cnt >= 0){
            sum_xy += iArr[x_cnt][y_cnt];
            x_cnt++;
            y_cnt--;
        }
        xy = sum_xy;
        sum_xy = 0;
        for (int i = 0; i < n; i++){
            int sum_x  = 0;
            int sum_y = 0;
            for (int j = 0; j < n; j++){
                System.out.printf(iArr[i][j] + " ");
                sum_x += iArr[j][i];
                sum_y += iArr[i][j];
                if (i == j){
                    sum_xy += iArr[i][j];
                }
                if (x < sum_x){
                    x = sum_x;
                }
                if (y < sum_y){
                    y = sum_y;
                }
                if (xy < sum_xy){
                    xy = sum_xy;
                }
            }
            System.out.println();
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(xy);
        answer = Math.max(x, y);
        answer = Math.max(answer, xy);
        return answer;
    }
}

public class Array_09 {
    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] iArr =new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                iArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, iArr));
        System.out.println("-------------------");
        System.out.println(T.bestSolution(n, iArr));
    }
}
