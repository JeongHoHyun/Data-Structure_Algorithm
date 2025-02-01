package coding_test._09Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;

    public Time(int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o){
        if (this.e == o.e){
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}

public class _02_MeetingRoom {
    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time t : arr) {
            if (t.s >= et) {
                et = t.e;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        _02_MeetingRoom T = new _02_MeetingRoom();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time(s, e));
        }
        System.out.println(T.solution(arr, n));
    }
}
