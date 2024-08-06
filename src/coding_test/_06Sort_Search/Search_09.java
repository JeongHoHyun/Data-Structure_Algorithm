package coding_test._06Sort_Search;

import java.util.Arrays;
import java.util.Scanner;

class Main9{
    public int count(int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr) {
        // 결정알고리즘 (이분검색이용)
        int answer = 0;
        // stream 에서 max()나 min()등의 메소드는 optional int 타입으로 반환하기 때문에 뒤에 .getAsInt()를 붙여 기본 int타입으로 형변환을 해야한다.
        int lt = Arrays.stream(arr).max().getAsInt();
        // sum()은 선언된 타입을 따라서 반환한다. int면 int, double 이면 double
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if (count(arr, mid) <= m){
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }
}
public class Search_09 {
    public static void main(String[] args) {
        Main9 T = new Main9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
