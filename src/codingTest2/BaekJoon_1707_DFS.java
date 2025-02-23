package codingTest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_1707_DFS {
    // 그래프를 담을 인접 리스트 생성
    static ArrayList<Integer>[] A;
    // 이분 그래프인지 확인을 위해 체크 배열 생성
    static int[] check;
    // 방문 여부를 확인하기 위해 visited 배열 생성
    static boolean[] visited;
    // 이분 그래프 여부 확인을 위한 변수
    static boolean isEven;

    public static void main(String[] args) throws IOException {
        // 이분 그래프 판별하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {    // 주어진 테스트 케이스만큼 돌림
            String[] s = br.readLine().split(" ");
            // 노드의 개수
            int V = Integer.parseInt(s[0]);
            // 간선의 개수
            int E = Integer.parseInt(s[1]);

            A = new ArrayList[V+1];
            visited = new boolean[V + 1];
            check = new int[V + 1];
            isEven = true;
            for (int i = 1; i <= V; i++) {
                A[i] = new ArrayList<>();
            }
            // 에지 데이터 저장하기
            for (int i = 0; i < E; i++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);
            }

            // 모든 노드에서 DFS 실행 해야함
            for (int i = 1; i <= V; i++) {
                if(isEven){
                    if(!visited[i]){
                        DFS(i);
                    }
                } else {
                    break;
                }
            }

            if(isEven) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    private static void DFS(int start) {
        visited[start] = true;
        for (int i : A[start]) { // 인접 리스트로 받아서 start에서 연결된 모든 노드 탐색
            if(!visited[i]){
                // 바로 직전에 있는 노드와 다른 집합으로 분류 필요
                check[i] = (check[start] + 1) % 2;
                DFS(i);
            } else {
                if (check[start] == check[i]) {
                    isEven = false;
                }
            }
        }
    }
}
