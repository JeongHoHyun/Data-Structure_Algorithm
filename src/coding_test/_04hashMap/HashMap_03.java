package coding_test._04hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Main3{
    public int[] solution(int n, int k, int[] arr){
        int[] answer = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0;
        while (lt + k <= n){
            for (int i = lt; i < lt + k; i++){
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            answer[lt++] = map.size();
            map.clear();
        }
        return answer;
    }
    public ArrayList<Integer> Tsolution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) -1);
            if (HM.get(arr[lt]) == 0){
                HM.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }
}

public class HashMap_03 {
    public static void main(String[] args) {
        Main3 T = new Main3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(n, k, arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : T.Tsolution(n, k, arr)) {
            System.out.print(i + " ");
        }

    }
}
