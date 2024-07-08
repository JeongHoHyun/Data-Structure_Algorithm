package coding_test._03twoPointers;

import java.util.Scanner;

class Main5{
    public int solution(int n){
        int answer = 0, sum = 0, lt = 0;
        // 연속한 자연수의 합이기 때문에 2를 나눈 값 정도 까지만 더하면 된다.
        int  m = n/2 +1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++){
            arr[i] = i+1; // 1부터 넣어야한다.
        }
        for (int rt = 0; rt < m; rt ++){
            sum += arr[rt];
            if (sum == n){
                answer++;
            }
            while (sum >= n){
                sum -= arr[lt++];
                if (sum == n){
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class twoPointers_05 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
