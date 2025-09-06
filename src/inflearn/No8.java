package inflearn;

import java.util.Scanner;

public class No8 {
    public static String solution1(String s){
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : charArr){
            if(Character.isAlphabetic(c)){
                sb.append(c);
            }
        }
        int lt = 0;
        int rt = sb.toString().length() - 1;
        while(lt < rt){
            if(sb.toString().charAt(lt) == sb.toString().charAt(rt)){
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }
        return "YES";
    }
    public static String solution2(String s){
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "YES";
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll(" ", "").toUpperCase();
        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }
}
