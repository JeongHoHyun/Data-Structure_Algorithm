package coding_test._06Sort_Search;

import java.util.Scanner;

class Main1{
    public int[] solution(int n, int[] arr) {
        // 선택정렬
        // 끝까지 돌지 않아도 된다.
        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    // 여기서 1~n 번째 까지의 값중에 제일 작은 값이 idx에 들어간다.
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
public class Sort_01 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
