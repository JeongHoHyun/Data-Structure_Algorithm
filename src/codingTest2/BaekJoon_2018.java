package codingTest2;

import java.util.Scanner;

public class BaekJoon_2018 {
    public static void main(String[] args){
        // 투 포인터 문제
        // 어떠한 자연수N은 몇 개의 연속된 자연수의 합으로 나타낼 수 있다.
        // 어떤 자연수 N(1 <= N <= 10,000,000)을 몇 개의 연속된 자연수의 합으로 나타내는 가짓수를 알고싶다.
        // 이떄 사용하는 자연수는 N이어야 한다.
        // 예를 들어 15를 나타내는 방법은 15, 7+8, 4+5+6, 1+2+3+4+5이다.
        // 10을 나타내는 방법은 1+2+3+4 이다.
        // N을 입력받아 연속된 자연수의 합으로 나타내는 가짓수를 출력하는 프로그램을 작성하시오.

        // 입력
        // 1번째 줄에 정수 N이 주어진다.

        // 출력
        // 입력된 자연수 N을 연속된 자연수의 합으로 나타내는 가짓수를 출력한다.
        // 15 -> 4

        // 투포인터 이동원칙
        // sum > N : sum = sum - start_index; start_index++;
        // sum < N : end_index++; sum = sum + end_index;
        // sum == N : end_index++; sum = sum + end_index; count++;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
