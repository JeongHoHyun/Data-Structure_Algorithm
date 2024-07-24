package coding_test._05Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main7{
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for (char c : need.toCharArray()) {
            Q.offer(c);
        }
        for (char c : plan.toCharArray()) {
            if (Q.contains(c)) {
                if (c != Q.poll()) {
                    return "NO";
                }
            }
        }
        if (!Q.isEmpty()) {
            return "NO";
        }
        return answer;
    }
}

public class Queue_07 {
    public static void main(String[] args) {
        Main7 T = new Main7();
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();
        System.out.println(T.solution(need, plan));
    }
}
