package codingTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_11659 {
    public static void main(String[] args) throws IOException {
        // 수 N개가 주어졌을 때 i번째 수에서 j 번째 수까지의 합을 구하는 프로그램을 작성하시오

        // 입력
        // 1번째 줄에 수의 개수 N(1 <= N <= 100,000), 합을 구해야하는 횟수 M(1<= M <= 100,000),
        // 2번째 줄에 N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수다.
        // 3번째 줄 부터는 M개의 줄에 합을 구해야하는 구간 i와 j가 주어진다.

        // 받는 값이 10만개 까지 될 수있다.
        // 받는 값이 크면 Scanner 보다 BufferedReader를 사용해야한다.
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer는 숫자의 개수가 10만개일 경우 한줄에 옆으로 길게 데이터가 들어오면 int형으로 받기가 힘들 때 사용한다.
        // 이경우 IOException을 throws해주어야 한다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sumArr = new long[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N+1; i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int z = 0; z < M; z++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[j] - sumArr[i - 1]);
        }
    }
}
