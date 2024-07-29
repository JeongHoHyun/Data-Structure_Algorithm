package coding_test._06Sort_Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main4{
    // ArrayList를 이용하여 풀 수 도 있지만, 삽입 정렬을 이용하여 배열로 풀것 권장. 코드 작성능력을 보기위해
    public int[] bestSolution(int size, int n, int[] arr){
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i<size; i++){
                if (x == cache[i]){
                    pos = x;
                }
            }
            if (pos == -1){
                for (int i = size - 1; i >= 1; i--){
                    cache[i] = cache[i -1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }
    public List<Integer> solution(int size, int n, int[] arr){
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (answer.size() == size){
                if (answer.contains(arr[i])){
                    // 그냥 arr[i]를 remove를 하면 해당 index 값이 삭제 됨으로 명시적으로 (Integer) 를 선언 해준다.
                    answer.remove((Integer) arr[i]);
                    answer.add(0, arr[i]);
                } else {
                    answer.remove(size - 1);
                    answer.add(0, arr[i]);
                }
            } else {
                if (answer.contains(arr[i])){
                    answer.remove((Integer) arr[i]);
                    answer.add(0, arr[i]);
                } else {
                    answer.add(0, arr[i]);
                }
            }
        }
        return answer;
    }
}

public class Sort_04 {
    public static void main(String[] args) {
        Main4 T = new Main4();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : T.solution(size, n, arr)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : T.bestSolution(size, n, arr)) {
            System.out.print(i + " ");
        }
    }
}
