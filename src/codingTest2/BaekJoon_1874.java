package codingTest2;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_1874 {
    public static void main(String[] args) {
        // 스택으로 오름차순 수열 만들기
        // 1부터 N까지 오름차순으로 스택에 push를 하면서 필요할때마다 pop을 하여 주어진 임의의 수열을 출력할 수 있는지에 대한 문제
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            if (tmp >= num) {
                while (tmp >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int n = stack.pop();
                if(n > tmp){
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) {
            System.out.println(sb.toString());
        }
    }
}
