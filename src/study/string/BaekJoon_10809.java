package study.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] alphabet = new char[] {'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P'
                ,'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Map<Character, Integer> result = new HashMap<>();
        String s = br.readLine();
        for (char c : alphabet) {
            int index = s.toUpperCase().indexOf(c);
            result.put(c, index);
        }

        for (int i : result.values()){
            System.out.print(i + " ");
        }
    }
}
