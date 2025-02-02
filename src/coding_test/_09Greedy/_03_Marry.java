package coding_test._09Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Marry implements Comparable<Marry>{
    int time;
    char state;
    public Marry(int t, char s){
        this.time = t;
        this.state = s;
    }
    @Override
    public int compareTo(Marry o){
        if (this.time == o.time){
            return this.state - o.state;
        } else {
            return this.time - o.time;
        }
    }
}

public class _03_Marry {
    public int solution(ArrayList<Marry> arr){
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        Collections.sort(arr);
        for (Marry m : arr) {
            if (m.state == 's'){
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        _03_Marry T = new _03_Marry();
        Scanner sc = new Scanner(System.in);
        ArrayList<Marry> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            arr.add(new Marry(s, 's'));
            int e = sc.nextInt();
            arr.add(new Marry(e, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
