package inflearn;

import java.util.*;
public class No3_2 {
    public static int solution1(int[] arr){
        int answer = 0;
        int tmp = 0;
        for(int i : arr){
            if(i > tmp){
                answer++;
                tmp = i;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solution1(arr));
    }
}
