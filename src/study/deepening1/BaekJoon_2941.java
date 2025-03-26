package study.deepening1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String S = st.nextToken();
        String[] cros = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < cros.length; i++) {
            if (S.contains(cros[i])) {
                S = S.replaceAll(cros[i], "1");
            }
        }
        System.out.print(S.length());
    }
}
