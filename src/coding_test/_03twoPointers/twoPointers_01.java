package coding_test._03twoPointers;

import java.util.ArrayList;
import java.util.Scanner;

class Main1{
    public ArrayList<Integer> bestSolution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 =0;
        while(p1 < n && p2 < m){
            if (a[p1] < b[p2]){
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }
        while (p1 < n){
            answer.add(a[p1++]);
        }
        while (p2 < m){
            answer.add(b[p2++]);
        }
        return answer;
    }
    public int[] solution(int[] arr1, int[] arr2){
        int[] answer = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            answer[i] = arr1[i];
        }
        for (int j = arr1.length; j < answer.length; j++){
            int cnt = 0;
            answer[j] = arr2[j - arr1.length];
        }
        for (int k = 0; k < answer.length; k++){
            int tmp = 0;
            for (int z = 0; z < answer.length; z++){
                // 버블정렬
                if (answer[k] < answer[z]){
                    tmp = answer[k];
                    answer[k] = answer[z];
                    answer[z] = tmp;
                }
            }
        }
        return answer;
    }
}


public class twoPointers_01 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++){
            arr2[i] = sc.nextInt();
        }
        for (int i : T.solution(arr1, arr2)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("==================");
        for (int i : T.bestSolution(n, m, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
