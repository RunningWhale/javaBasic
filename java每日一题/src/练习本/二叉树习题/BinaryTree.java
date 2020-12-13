package 练习本.二叉树习题;

public class BinaryTree {
    //构造一个二叉树
    public Node createTree() {
        Node A = new Node(1);
        Node B = new Node(2);
        Node C = new Node(3);
        A.left = B;
        B.left=C;
        return A;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int i = bt.minDepth(bt.createTree());
        System.out.println(i);
    }

    //求二叉树最小深度
    public int minDepth(Node root) {
        if (root == null) {
            return 0;
        }int n;

        if (root.left==null){
            n= minDepth(root.right) + 1;
            return n;
        }
        if (root.right==null){
             n=minDepth(root.left)+1;
            return n;
        }
        n= Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        return n;
    }
}
