package coding_test._04hashMap;

import java.util.HashMap;
import java.util.Scanner;

class Main4{
    public int solution(String str1, String str2){
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        // 비교 대상은 미리 map에 담아 만들어둔다.
        for (char c : str2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        int lt = 0;
        int length = str2.length() - 1;
        // 비교 할 대상은 하나 전까지 미리 만들어둔다.
        for (int i = 0; i < length; i ++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0 + 1));
        }
        for (int i = length; i < str1.length(); i++){
            // ex 3글자 비교면, 2글자까지 미리 넣어둔 map에 바로 넣어주면서 비교시작.
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
            if (map1.equals(map2)){
                answer++;
            }
            map1.put(str1.charAt(lt), map1.get(str1.charAt(lt)) -1);
            if (map1.get(str1.charAt(lt)) == 0){
                map1.remove(str1.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
}
public class HashMap_04 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution(str1, str2));
    }
}
