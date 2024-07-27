package coding_test._06Sort_Search;

import java.util.Scanner;

class Main2{
    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            // 이미 정렬된 부분은 제외 해야 하기 때문에 n-i-1 까지 반복
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}

public class Sort_02 {
    public static void main(String[] args) {
        Main2 T = new Main2();
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
