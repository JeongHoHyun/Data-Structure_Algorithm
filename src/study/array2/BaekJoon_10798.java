package study.array2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[][] arr = new String[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = "-1";
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = String.valueOf(st.nextToken()).trim();

            for (int j = 0; j < tmp.length(); j++) {
                arr[i][j] = String.valueOf(tmp.charAt(j));
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(!arr[j][i].equals("-1")){
                    sb.append(arr[j][i]);
                }
            }
        }

        System.out.println(sb);
    }
}
