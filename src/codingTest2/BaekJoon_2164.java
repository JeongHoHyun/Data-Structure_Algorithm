package codingTest2;

import java.util.*;
import java.util.Scanner;

public class BaekJoon_2164 {
    public static void main(String[] args) {
        // 카드게임
        // N 장의 카드가 있다. 각각의 카드는 차례로 1에서 N까지의 번호가 붙어있으며,
        // 1번 카드가 가장 위, N번 카드가 가장 아래인 상태로 놓여있다. 이제 다음과 같은 동작을 카드가 1장 남을 때 까지 반복한다.

        // 가장 위에 있는 카드를 바닥에 버린다.
        // 그다음 가장 위에 있는 카드를 가장 아래에 있는 카드 밑으로 옮긴다.
        // 예를들어, N = 4일 때, 카드는 가장 위에서 부터 1, 2, 3, 4의 순서대로 놓여있다. 1을버리면 2, 3 ,4가 남는다.
        // 여기서 2를 가장 아래로 옮기면 순서가 3, 4, 2가 된다. 3을 버리면 4, 2가 남고, 4를 밑으로 옮기면 순서가 2, 4가 된다.
        //  마지막으로 2를 버리면 카드 4가 남는다.
        // N이 주어졌을 때 가장 마지막에 남는 카드를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < N+1; i++) {
            q.offer(i);
        }
        startGame(q);
        if(q.size() == 1){
            System.out.println(q.peek());
        }
    }

    private static void startGame(Queue<Integer> q) {
        while(q.size() != 1){
            q.poll();
            q.offer(q.poll());
        }
    }
}
