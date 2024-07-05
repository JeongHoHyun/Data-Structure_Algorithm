package coding_test._03twoPointers;

import java.util.Scanner;

class Main3{
    public int slidingWindow(int n, int m, int[] arr){
        // Sliding Window 방식 풀이
        int answer, sum = 0;
        for (int i = 0; i < m; i++){
            sum += arr[i];
        }
        answer = sum;
        // m 개 만큼 창을 밀고 가는 것 처럼 구하는 것
        // ex) m = 3 일때, sum = arr[0] + arr[1] + arr[2] 의 값이 담겨있고,
        // i = 3 일때, sum 에서 arr[3] 번째를 더하고, arr[3-3]인 arr[0] 즉 처음 값을 빼준다.
        // 따라서 i = 3 일 때, sum = arr[0] + arr[1] + arr[2] + [arr3] - arr[0] = arr[1] + arr[2] + arr[3]
        // 따라서 i = 4 일 때, sum = arr[1] + arr[2] + arr[3] + [arr4] - arr[1] = arr[2] + arr[3] + arr[4]
        // ...
        for (int i = m; i < n; i++){
            sum += (arr[i] - arr[i - m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
    public int solution (int n, int m, int[] arr){
        int answer = 0;
        int cnt = 0;
        while (cnt <= n - m){
            int sum = 0;
            for (int i = cnt; i < m + cnt; i ++){
                sum += arr[i];
            }
            answer = Math.max(answer, sum);
            cnt++;
        }
        return answer;
    }
}

public class twoPointers_03 {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
        System.out.println(T.slidingWindow(n, m, arr));
    }
}
