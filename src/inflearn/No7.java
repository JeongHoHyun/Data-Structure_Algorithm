package inflearn;

import java.util.Scanner;

public class No7 {
    public static String solution1(String s){
        char[] charArr = s.toUpperCase().toCharArray();
        int lt = 0;
        int rt = charArr.length - 1;
        while(lt < rt){
            if(charArr[lt] == charArr[rt]){
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }
        return "YES";
    }

    public static String solution2(String s){
        String str = s.toUpperCase();
        int len = s.length() - 1;
        for (int i = 0; i < len/2; i ++){
            if(str.charAt(i) != str.charAt(len - i)){
                return "NO";
            }
        }
        return "YES";
    }

    public static String solution3(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equalsIgnoreCase(tmp)){
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution1(s));
        System.out.println(solution2(s));
        System.out.println(solution3(s));
    }
}
