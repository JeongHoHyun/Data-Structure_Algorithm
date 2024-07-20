package coding_test._05Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

class Main3{
    public int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) {
                    int tmp = board[i][pos - 1];
                    board[i][pos - 1] = 0;
                    // peek()는 stack의 마지막 요소를 가져온다. (pop() 은 삭제를 하고 가져오지만 peek()는 삭제하지 않음)
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}

public class Stack_03 {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
