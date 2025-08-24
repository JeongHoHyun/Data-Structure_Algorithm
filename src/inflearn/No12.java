package inflearn;

import java.util.*;
public class No12 {
    public static String solution(String password, int n){
        String answer = "";
        for (int i=0; i<n; i++){
            String tmp = password.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            password = password.substring(7);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String password = sc.next();

        System.out.println(solution(password, n));
    }
}
