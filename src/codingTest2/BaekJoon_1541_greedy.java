package codingTest2;

import java.util.Scanner;

public class BaekJoon_1541_greedy {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ex = sc.nextLine();
        String[] arr = ex.split("-");
        for (int i = 0; i < arr.length; i++) {
            int tmp = mySum(arr[i]);
            if(i == 0){
                answer = answer + tmp;
            } else {
                answer -= tmp;
            }
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        // split할때 + 를 잘 인식하지 못하므로 대괄호 [] 안에 + 를 담아 주어야 한다.
        String[] tmp = s.split("[+]");
        for (int i = 0; i < tmp.length; i++) {
            sum = sum + Integer.parseInt(tmp[i]);
        }
        return sum;
    }
}
