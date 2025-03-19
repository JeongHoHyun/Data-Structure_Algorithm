package codingTest2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_2252 {
    public static void main(String[] args) {
        // 줄 세우기
        // 위상정렬
        Scanner sc = new Scanner(System.in);
        // 학생 수 받기
        int N = sc.nextInt();
        // 비교 수 받기
        int M = sc.nextInt();
        // 인접 리스트 선언
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            // 초기화
            A.add(new ArrayList<>());
        }
        // 진입 차수 배열 초기화
        int inDegree[] = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            // 시작 인덱스에 종료 인덱스 추가
            // S에 E가 연결
            A.get(S).add(E);
            // 진입 차수 증가
            // E 를 바라보는 것이 있기 떄문에
            inDegree[E]++;
        }

        // 위상정렬 실행
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                // 진입 차수가 0인 노드를 큐에 삽입.
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");
            for (int next : A.get(now)) {
                inDegree[next]--;
                if(inDegree[next] == 0){
                    q.offer(next);
                }
            }
        }
    }
}
