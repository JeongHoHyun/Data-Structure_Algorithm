package coding_test._07Section;
class Main1{
    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            // 스택프레임으로 인해 print 위치에 따라 출력 순서가 달라진다.
            System.out.print(n + " "); // 3 2 1 출력
            DFS(n-1);
            System.out.print(n + " "); // 1 2 3 출력
        }
    }
}

public class _01_RecursionFunction {
    public static void main(String[] args) {
        Main1 T = new Main1();
        T.DFS(3);
    }
}
