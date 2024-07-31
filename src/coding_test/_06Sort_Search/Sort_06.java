package coding_test._06Sort_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main6{
    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        //int[] sortArr = arr 그냥 이렇게 선언하면 sortArr을 정렬하면 arr도 같이 정렬됨
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != sortArr[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }
}
public class Sort_06 {
    public static void main(String[] args) {
        Main6 T = new Main6();
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
