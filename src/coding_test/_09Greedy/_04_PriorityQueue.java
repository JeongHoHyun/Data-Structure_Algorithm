package coding_test._09Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
class Lecture implements Comparable<Lecture>{
    public int money;
    public int date;
    public Lecture(int m, int d){
        this.money = m;
        this.date = d;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.date - this.date;
    }
}

public class _04_PriorityQueue {
    static int n, max = Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr){
        int answer = 0;
        // Collections.reverseOrder() 를 해주어야 큰값을 우선순위로 한다.
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        // 날짜에 의해 내림차순 정렬
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for ( ;j < n; j++){
                // 작으면 break, == 크거나 같은 값만 넣는다는 뜻 (하지만 클수는 없으니 같은 것만 넣겟다고 봐도 됌)
                // j를 for 문 밖에 선언 했으므로, 한번 들어간 값은 들어가지 않음.
                if (arr.get(j).date < i) {
                    break;
                }
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()){
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        _04_PriorityQueue T = new _04_PriorityQueue();
        Scanner sc = new Scanner(System.in);
        ArrayList<Lecture> arr = new ArrayList<>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) {
                max = d;
            }
        }
        System.out.println(T.solution(arr));
    }
}
