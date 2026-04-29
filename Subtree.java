class Subtree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    public static boolean isIdentical(Node t1, Node t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        if (t1.data != t2.data) return false;
        return isIdentical(t1.left, t2.left) &&
               isIdentical(t1.right, t2.right);
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) return false;
        if (isIdentical(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(2);
        Node subRoot = new Node(4);
        subRoot.left = new Node(1);
        subRoot.right = new Node(2);
        System.out.println(isSubtree(root, subRoot));
    }
}