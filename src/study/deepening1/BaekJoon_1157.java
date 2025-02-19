package study.deepening1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken().toUpperCase();
        char[] A = S.toCharArray();
        int[] cnt = new int[26];
        for (char c : A) {
            cnt[c - 'A']++;
        }

        int max = Integer.MIN_VALUE;
        char maxValue = 0;
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                maxValue = (char) (i + 'A');
            } else if (cnt[i] == max) {
                maxValue = '?';
            }
        }
        System.out.println(maxValue);
    }
}
