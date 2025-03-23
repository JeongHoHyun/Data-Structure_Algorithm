package study.string;

import java.util.Scanner;

public class BaekJoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        char[] arr;

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            int R = sc.nextInt();
            String S = sc.next();
            arr = S.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                for (int z = 0; z < R; z++) {
                    sb.append(arr[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
