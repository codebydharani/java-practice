class LCA {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node findLCA(Node root, Node p, Node q) {
        if (root == null || root == p || root == q)
            return root;
        Node left = findLCA(root.left, p, q);
        Node right = findLCA(root.right, p, q);
        if (left != null && right != null)
            return root;
        return (left != null) ? left : right;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        Node p = root.left.left;
        Node q = root.left.right;
        Node lca = findLCA(root, p, q);
        System.out.println("LCA: " + lca.data);
    }
}