package coding_test._09Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int h, w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

public class _01_Ssireum {
    public int solution(int n, ArrayList<Body> arr) {
        int answer = 0;
        // 키 내림차순 정렬 Body 객체에서 Comparable을 상속받아 정렬방법을 정해주었다.
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body b : arr) {
            if (b.w > max) {
                max = b.w;
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        _01_Ssireum T = new _01_Ssireum();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(n, arr));;
    }
}
