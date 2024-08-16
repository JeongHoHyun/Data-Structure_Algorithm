package coding_test._07Section;

import java.util.Scanner;

class Main2{
    public void DFS(int n){
        if (n == 0) {
            return;
        } else {
            DFS(n/2);
            System.out.print(n % 2);
        }
    }
}

public class _02_RecursionFunction {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        T.DFS(sc.nextInt());
    }
}
