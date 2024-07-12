package coding_test._04hashMap;

import java.util.HashMap;
import java.util.Scanner;

class Main1{
    public char solution(int n, String str){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            // c의 키값을 가져오고, c의 키값이 없으면 뒤의 값(여기에선 0)을 리턴한다.
            // counting 할때 매우 중요하므로 잊지말고 잘 알아둘 것
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        // map 의 key가 A를 포함하는지확인하여 true/false 반환
        System.out.println(map.containsKey('A'));
        // 해당 key값을 map에서 제거후, 제거한 key의 value값 반환
        System.out.println(map.remove('C'));
        // map의 key의 개수 반환
        System.out.println(map.size());
        int max = Integer.MIN_VALUE;
        // map의 key값을 순회한다.
        for (char key : map.keySet()) {
            // map.get(c)는 키가 c인 값(value)를 가져온다.
            //System.out.println(key + " " + map.get(key));
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}
public class HashMap_01 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
