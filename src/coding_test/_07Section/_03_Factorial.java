package coding_test._07Section;

import java.util.Scanner;

class Main3{
    public int DFS(int n){
        if (n == 1){
            return 1;
        } else {
            return n * DFS(n-1);
        }
    }
}

public class _03_Factorial {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        System.out.println(T.DFS(sc.nextInt()));
    }
}
