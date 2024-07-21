package coding_test._05Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

class Main4{
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            //  숫자인지 확인하는 메소드
            if (Character.isDigit(c)) {
//                stack.push(Integer.parseInt(String.valueOf(c)));
                // 아스키코드값을 뺴주면 숫자가들어감 여기서 48은 아스키코드에서 숫자 0
                stack.push(c -48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '+'){
                    stack.push(lt + rt);
                } else if (c == '-'){
                    stack.push(lt - rt);
                } else if (c == '*'){
                    stack.push(lt * rt);
                } else if (c == '/'){
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }
}

public class Stack_04 {
    public static void main(String[] args) {
        // 후위 연산식
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
