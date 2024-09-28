package coding_test._07Section;
class Node1{
    int data;
    Node1 lt, rt;

    public Node1(int val) {
        data = val;
        lt = rt = null;
    }
}
class Main5{
    Node1 root;
    public void DFS(Node1 root) {
        if (root == null) {
            return;
        } else {
            // print의 위치에 따라 달라진다.
//            System.out.print(root.data + " ");  // 전위 순회
            DFS(root.lt);
//            System.out.print(root.data + " ");  // 중위 순회
            DFS(root.rt);
            System.out.print(root.data + " ");  // 후위 순회
        }

    }
}

public class _05_BinaryTree {

    public static void main(String[] args) {
        Main5 tree = new Main5();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.root.rt.lt = new Node1(6);
        tree.root.rt.rt = new Node1(7);
        tree.DFS(tree.root);
    }
}
