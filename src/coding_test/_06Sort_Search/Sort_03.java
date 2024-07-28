package coding_test._06Sort_Search;

import java.util.Scanner;

class Main3{
    public int[] solution(int n, int[] arr){
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            // 아래로 가면서 정렬
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            // 반복문이 끝나면 정렬시켜줘야 하기 때문에
            arr[j+1] = tmp;
        }
        return arr;
    }
}
public class Sort_03 {

    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[n] = sc.nextInt();
        }
        for (int i : T.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }
}
