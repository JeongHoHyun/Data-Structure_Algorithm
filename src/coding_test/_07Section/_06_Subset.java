package coding_test._07Section;

import java.util.Scanner;

class Main6{
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n+1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] ==1){
                    tmp += i + " ";
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1;
            DFS(L+1);
            ch[L] = 0;
            DFS(L+1);
        }
    }
}

public class _06_Subset {
    public static void main(String[] args) {
        Main6 T = new Main6();
        Scanner sc = new Scanner(System.in);
        T.n = sc.nextInt();
        T.ch = new int[T.n + 1];
        T.DFS(1);

    }
}
