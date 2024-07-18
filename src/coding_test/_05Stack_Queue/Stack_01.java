package coding_test._05Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

class Main1{
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return "NO";
        }
        return answer;
    }
}

public class Stack_01 {
    public static void main(String[] args) {
        Main1 T = new Main1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
