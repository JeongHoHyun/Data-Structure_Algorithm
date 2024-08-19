package coding_test._07Section;

import java.util.Scanner;

class Main4{
    static int[] fibo;
    public int DFS(int n) {
        if (fibo[n] > 0) {
            return fibo[n];
        }
        if (n == 1){
            return fibo[n] = 1;
        } else if (n == 2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }

}

public class _04_Fibonacci {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(T.fibo[i] + " ");
        }
        System.out.println();
        // for 문을 이용하여 만든 피보나치 수열
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1){
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
