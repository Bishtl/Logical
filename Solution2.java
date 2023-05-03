// Level order traversal of Binary key

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left ,right;

    public Node(int item){
    data = item;
    left = null;
    right = null;
    }
}



public class Solution2 {

    Node root;
    void print(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.println(n.data+" ");

            if(n.left!=null){
                queue.add(n.left);
            }
            if(n.right!=null){
                queue.add(n.right);
            }
        }
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.root = new Node(7);
        s.root.left = new Node(5);
        s.root.right = new Node(9);
        s.root.left = new Node(1);
        s.root.right = new Node(34);

        s.print();
    }
}
