package coding_test._05Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

class Main2{
    public String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '('){
                stack.push(c);
            } else if (c == ')'){
                stack.pop();
            } else {
                if (stack.isEmpty()){
                    stack2.push(c);
                }
            }
        }
        for (char c : stack2){
            answer += c;
        }
        return answer;
    }
    public String Tsolution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()){
            if (c == ')'){
                // pop은 마지막 요소를 제거하고 그 요소를 리턴하는 특성을 이용하여 여는 괄호가 나올때 까지 pop()한다.
                while (stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }
        for (char c : stack){
            answer += c;
        }
        return answer;
    }
}

public class Stack_02 {
    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        System.out.println(T.Tsolution(str));
    }
}
