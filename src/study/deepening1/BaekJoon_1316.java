package study.deepening1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String[] A = new String[N];
        int cnt = N;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            boolean[] check = new boolean[26];

            for (int j = 0; j < S.length() - 1; j++) {
                if (S.charAt(j) != S.charAt(j + 1)) {
                    if (check[S.charAt(j + 1) - 'a']) {
                        cnt--;
                        break;
                    }
                }
                check[S.charAt(j) - 'a'] = true;
            }
        }
        System.out.println(cnt);
    }
}
