package coding_test._07Section;

import java.util.LinkedList;
import java.util.Queue;

class Node7{
    int data;
    Node7 lt, rt;

    public Node7(int val) {
        data = val;
        lt = rt = null;
    }
}
class Main7{
    Node7 root;

    public void BFS(Node7 root) {
        Queue<Node7> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node7 cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }
    }
}
public class _07_BFS {
    public static void main(String[] args) {
        Main7 tree = new Main7();
        tree.root = new Node7(1);
        tree.root.lt = new Node7(2);
        tree.root.rt = new Node7(3);
        tree.root.lt.lt = new Node7(4);
        tree.root.lt.rt = new Node7(5);
        tree.root.rt.lt = new Node7(6);
        tree.root.rt.rt = new Node7(7);
        tree.BFS(tree.root);
    }
}
