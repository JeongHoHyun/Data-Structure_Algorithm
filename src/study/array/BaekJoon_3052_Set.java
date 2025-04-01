package study.array;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_3052_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(set.size());
    }
}
