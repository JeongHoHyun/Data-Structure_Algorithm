package study.string;

import java.util.Scanner;

public class BaekJoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            String result = (S.charAt(0) + "") + (S.charAt(S.length() -1) + "");
            System.out.println(result);
        }
    }
}
