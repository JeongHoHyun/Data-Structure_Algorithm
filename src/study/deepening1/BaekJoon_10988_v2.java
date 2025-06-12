package study.deepening1;

import java.util.Scanner;

public class BaekJoon_10988_v2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();
        int len = S.length();
        int ans = 1;
        for (int i = 0; i < len / 2 ;i++) {
            if (S.charAt(i) != S.charAt(len - 1 - i)) {
                ans = 0;
            }
        }
        System.out.println(ans);
    }
}
