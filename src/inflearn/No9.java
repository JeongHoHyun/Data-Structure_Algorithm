package inflearn;

import java.util.Scanner;

public class No9 {
    public static int solution1(String str) {
        return Integer.parseInt(str.replaceAll("[^0-9]", ""));
    }

    public static int solution2(String str) {
        int answer = 0;
        for(char c : str.toCharArray()){
            if(c >= 48 && c <= 57){
                answer = answer * 10  + (c-48);
            }
        }
        return answer;
    }

    public static int solution3(String str) {
        String answer = "";
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        System.out.println(solution1(str));
        System.out.println(solution2(str));
        System.out.println(solution3(str));
    }
}
