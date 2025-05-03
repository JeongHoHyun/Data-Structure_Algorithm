package study.deepening1;

import java.util.Scanner;

public class BaekJoon_10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        char[] A = S.toCharArray();
        int lt = 0;
        int rt = A.length-1;

        int result = -1;
        while (lt <= rt) {
            if(A[lt] != A[rt]){
                result = 0;
                break;
            } else if (A[lt] == A[rt]) {
                result = 1;
                lt++;
                rt--;
            }
        }
        System.out.println(result);
    }
}
