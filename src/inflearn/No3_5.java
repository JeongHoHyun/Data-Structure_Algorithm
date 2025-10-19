package inflearn;

import java.util.*;
public class No3_5 {
    public static int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        for (int i = 2; i < n+1; i++){
            if(arr[i] == 0){
                answer++;
                for(int j = 1; i*j < n+1; j++){
                    arr[i*j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
