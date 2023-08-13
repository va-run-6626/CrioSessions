package DSA_3_August.Session2;

import java.util.*;

public class Prog2_ZigZagLevelOrder {
    public static class Node{
        public int val;
        public Node left;
        public Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1); Node node1 = new Node(2); Node node2 = new Node(3);
        Node node3 = new Node(4); Node node4 = new Node(5); Node node5 = new Node(6); Node node6 = new Node(7);
        root.left = node1; root.right = node2;
        node1.left = node3; node1.right = node4;
        node2.left = node5; node2.right = node6;
        System.out.println("Print Zig-Zag Level Order traversal :");
        List<List<Integer>> list = zigzagLevelOrder(root);
        for(List<Integer> l : list){
            System.out.println(l);
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(Node root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> subList = new ArrayList<>();
            int nodes = queue.size();
            for(int i = 0; i < nodes; i++){
                Node temp = queue.poll();
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
                subList.add(temp.val);
            }
            if(level % 2 == 1){
                Collections.reverse(subList);
            }
            level++;
            list.add(subList);
        }
        return list;
    }
}
