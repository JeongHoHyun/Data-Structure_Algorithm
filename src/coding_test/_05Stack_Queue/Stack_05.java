package coding_test._05Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

class Main5{
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        // for each 를 사용하면 이전꺼를 따로 담고있어야 하기 떄문에 일반 for 문 사용
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else {
                stack.pop();
                if (str.charAt(i-1) == '('){
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}
public class Stack_05 {
    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
