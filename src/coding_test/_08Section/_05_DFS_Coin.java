package coding_test._08Section;

import java.util.*;

public class _05_DFS_Coin {
    static int n, m, answer = Integer.MAX_VALUE;
    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) {
            return;
        }
        if (L >= answer) {
            return;
        }
        if (sum == m){
            answer = Math.min(answer, L);
        }  else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }

    }
    public static void main(String[] args) {
        _05_DFS_Coin T = new _05_DFS_Coin();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // Collections.reverseOrder() 를 사용하기위해 기본형(int)이 아닌 객체형(Integer)로 선언
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 배열을 큰수부터 정렬한다.
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
