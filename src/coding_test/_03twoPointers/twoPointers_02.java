package coding_test._03twoPointers;

import java.util.*;
import java.util.Scanner;

class Main2{
    public ArrayList<Integer> pointerSolution(int n, int m, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m){
            if (arr1[p1] == arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }
    public ArrayList<Integer> solution(int n, int m, int[] arr1, int[]arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (arr1[i] == arr2[j]){
                    answer.add(arr1[i]);
                }
            }
        }
        return answer;
    }
}
public class twoPointers_02 {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        for(int x : T.solution(n, m, arr1, arr2)){
            System.out.print(x + " ");
        }
        System.out.println();
        for(int x : T.pointerSolution(n, m, arr1, arr2)){
            System.out.print(x + " ");
        }
    }
}
