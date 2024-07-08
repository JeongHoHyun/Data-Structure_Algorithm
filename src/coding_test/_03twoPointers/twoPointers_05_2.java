package coding_test._03twoPointers;

import java.util.Scanner;

class Main5_2{
    public int solution(int n){
        // cnt 는 연속된 자연수의 갯수
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            // cnt = 1로 시작해서 연속된 자연수는 최소 2개이상이니까 바로 ++ 시켜서 2로만들어주고 시작
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
        return answer;
    }
}

public class twoPointers_05_2 {
    public static void main(String[] args) {
        Main5_2 T = new Main5_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
