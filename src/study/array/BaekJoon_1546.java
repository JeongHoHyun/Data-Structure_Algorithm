package study.array;

import java.util.Scanner;

public class BaekJoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();


        long max = Integer.MIN_VALUE;
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            if(tmp > max){
                max = tmp;
            }
            sum += tmp;
        }
        double avg = sum / max * 100.0 / N;
        System.out.println(avg);
    }
}
