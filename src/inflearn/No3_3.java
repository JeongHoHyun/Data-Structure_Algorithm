package inflearn;

import java.util.*;

public class No3_3 {
    public static String[] solution1(int n, int[] arr1, int[] arr2){
        String[] strArr = new String[n];
        for(int i = 0; i < n; i++){
            if(arr1[i] == 1){
                if (arr2[i] == 2) {
                    strArr[i] = "B";
                } else if (arr2[i] == 3){
                    strArr[i] = "A";
                } else {
                    strArr[i] = "D";
                }
            } else if(arr1[i] == 2){
                if (arr2[i] == 2) {
                    strArr[i] = "D";
                } else if (arr2[i] == 3){
                    strArr[i] = "B";
                } else {
                    strArr[i] = "A";
                }
            } else if(arr1[i] == 3){
                if (arr2[i] == 2) {
                    strArr[i] = "A";
                } else if (arr2[i] == 3){
                    strArr[i] = "D";
                } else {
                    strArr[i] = "B";
                }
            }
        }
        return strArr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i = 0; i < n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            arr2[i] = sc.nextInt();
        }
        for(String s : solution1(n, arr1, arr2)){
            System.out.println(s);
        }
    }
}
