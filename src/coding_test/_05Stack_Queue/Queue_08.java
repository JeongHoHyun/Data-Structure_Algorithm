package coding_test._05Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

class Main8{
    public int solution(int n, int m, int[] arr){
        int answer = 1;
        int x = arr[m];
        // 순서가 필요하니 Person 클래스 생성후 id로 접수 순서 관리
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for (Person p : Q) {
                if (p.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                if (tmp.id == m) {
                    return answer;
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }
}

public class Queue_08 {
    public static void main(String[] args) {
        Main8 T = new Main8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
