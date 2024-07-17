package coding_test._04hashMap;


import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Main5{
    public int solution(int n, int k, int[] arr){
        int answer = -1;
        // 기본적으로 아무것도 적지 않으면 오름차순정렬
        // Collections.reverseOrder()를 작성하면 내림차순 정렬
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int l = j+1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k){
                return x;
            }
        }
        return answer;
    }
}

public class TreeSet_05 {
    public static void main(String[] args) {
        Main5 T = new Main5();
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
