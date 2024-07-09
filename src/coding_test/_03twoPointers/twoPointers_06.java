package coding_test._03twoPointers;

import java.util.Scanner;

class Main6{
    public int solution(int n, int k, int[] arr){
        // cnt는 1로 바꾼 0의 개수
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++){
            if (arr[rt] == 0){
                cnt++;
            }
            while(cnt > k){
                if (arr[lt] == 0){
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt +1);
        }
        return answer;
    }
}

public class twoPointers_06 {
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}