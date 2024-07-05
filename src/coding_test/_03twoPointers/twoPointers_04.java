package coding_test._03twoPointers;

import java.util.ArrayList;
import java.util.Scanner;

class Main4{
    public int bestSolution(int n, int m, int[] arr){
        int answer = 0, sum = 0, lt =0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m){
                answer++;
            }
            while(sum >= m){
                sum -= arr[lt++];
                if (sum == m){
                    answer++;
                }
            }
        }
        return answer;
    }
    public int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sum = 0;
            for (int x : list) {
                sum += x;
            }
            if (sum == m){
                answer++;
                list.remove(0);
                list.add(arr[i]);
            } else {
                if (sum < m){
                    list.add(arr[i]);
                } else if (sum > m){
                    list.remove(0);
                    i--;
                }
            }
        }
        sum = 0;
        for (int x : list){
            sum += x;
        }
        if (sum == m){
            answer++;
        }
        return answer;
    }
}
public class twoPointers_04 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
        System.out.println(T.bestSolution(n, m, arr));
    }
}
