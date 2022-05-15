package bfs_dfs.n_116_populating_next_right_pointers_in_each_node;


class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


public class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        if(root.left != null){
            root.left.next = root.right;
            if(root.next != null){
                root.right.next = root.next.left;
            }
        }

        connect(root.left);
        connect(root.right);
        return root;
    }
}