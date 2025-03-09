package codingTest2;

import java.util.Scanner;

public class BaekJoon_1717_unionFind {
    static int[] parent;
    public static void main(String[] args) {
        // 집합 표현하기
        Scanner sc = new Scanner(System.in);
        // 원소 개수 받기
        int N = sc.nextInt();
        // 질의 개수 받기
        int M = sc.nextInt();
        // 대표 노드 생성
        parent = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {   // 대표노드 초기화
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int question = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(question == 0) {
                union(a, b);
            } else {
                boolean result = checkSame(a, b);
                if(result){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }

        }
    }

    private static void union(int a, int b) {
        // 대표노드 찾아서 연결하기
        a = find(a);
        b = find(b);
        if(a != b) {
            parent[b] = a;
        }
    }

    private static int find(int a) {
        if (a == parent[a]) {
            return a;
        } else {
            return parent[a] = find(parent[a]); // value를 index로 바꿔서 또 찾아보기
        }
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b){
            return true;
        }
        return false;
    }
}
