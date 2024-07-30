package coding_test._06Sort_Search;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Main5{
    public char hashMapSolution(int n, int[] arr){
        // 해시맵을 사용하는 방법이 시간 복잡도 측면에서 더 효율적이다.
        // 시간 복잡도 : O(n)
        char answer = 'U';
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                return 'D';
            } else {
                map.put(i, 1);
            }
        }
        return answer;
    }
    public char sortSolution(int n, int[] arr){
        // 시간 복잡도 : O(n log n)
        char answer = 'U';
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i+1]){
                return 'D';
            }
        }
        return answer;
    }
    public char solution(int n, int[] arr){
        char answer = 'U';
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return 'D';
                }
            }
        }
        return answer;
    }
}

public class Sort_05 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
        System.out.println(T.sortSolution(n, arr));
        System.out.println(T.hashMapSolution(n, arr));
    }
}
