class BalancedTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    public static int checkHeight(Node root) {
        if (root == null) return 0;
        int left = checkHeight(root.left);
        if (left == -1) return -1;
        int right = checkHeight(root.right);
        if (right == -1) return -1;
        if (Math.abs(left - right) > 1)
            return -1;

        return 1 + Math.max(left, right);
    }
    public static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        if (isBalanced(root))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}